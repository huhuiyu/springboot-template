package top.huhuiyu.springboot.gradle.basic.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * ip工具
 * 
 * @author 胡辉煜
 */
public class IpUtils {
  private static final int MIN_LENGTH = 15;
  private static final String IP_SPLIT = ",";
  private static final String UNKNOWN = "unknown";
  private static final String LOCAL_IP = "127.0.0.1";

  /**
   * 获取客户端ip地址
   * 
   * @return 客户端ip地址
   * 
   * @throws Exception 处理发生异常
   */
  public static String getIpAddress() throws Exception {
    ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = servletRequestAttributes.getRequest();
    return getIpAddr(request);
  }

  /**
   * 获取客户端ip地址
   * 
   * @param request 客户端请求
   * 
   * @return 客户端ip地址
   * 
   * @throws Exception 处理发生异常
   */
  public static String getIpAddr(HttpServletRequest request) throws Exception {
    String ipAddress = null;
    try {
      ipAddress = request.getHeader("x-forwarded-for");
      if ((ipAddress == null) || (ipAddress.length() == 0) || UNKNOWN.equalsIgnoreCase(ipAddress)) {
        ipAddress = request.getHeader("Proxy-Client-IP");
      }
      if ((ipAddress == null) || (ipAddress.length() == 0) || UNKNOWN.equalsIgnoreCase(ipAddress)) {
        ipAddress = request.getHeader("WL-Proxy-Client-IP");
      }
      if ((ipAddress == null) || (ipAddress.length() == 0) || UNKNOWN.equalsIgnoreCase(ipAddress)) {
        ipAddress = request.getRemoteAddr();
        if (LOCAL_IP.equals(ipAddress)) {
          // 根据网卡取本机配置的IP
          InetAddress inet = null;
          try {
            inet = InetAddress.getLocalHost();
          } catch (UnknownHostException e) {
            e.printStackTrace();
          }
          ipAddress = inet.getHostAddress();
        }
      }
      // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割,
      if ((ipAddress != null) && (ipAddress.length() > MIN_LENGTH)) {
        if (ipAddress.indexOf(IP_SPLIT) > 0) {
          ipAddress = ipAddress.substring(0, ipAddress.indexOf(IP_SPLIT));
        }
      }
    } catch (Exception e) {
      ipAddress = "";
    }
    return ipAddress;
  }
}