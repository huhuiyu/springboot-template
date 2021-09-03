package top.huhuiyu.springboot.gradle.basic.base;

import java.io.Serializable;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * 分页信息
 * 
 * @author 胡辉煜
 */
@ApiModel(value = "PageBean", description = "分页信息")
public class PageBean implements Serializable {

  private static final long serialVersionUID = 4304761110542971220L;
  @ApiModelProperty(value = "分页大小")
  @ApiParam(hidden = true)
  private Integer pageSize = 10;
  @ApiModelProperty(value = "当前页码")
  @ApiParam(hidden = true)
  private Integer pageNumber = 1;
  @ApiModelProperty(value = "分页总数")
  @ApiParam(hidden = true)
  private Integer pageCount = 0;
  @ApiModelProperty(value = "记录总数")
  @ApiParam(hidden = true)
  private long total = 0;

  public PageBean() {
  }

  /**
   * 设置分页信息
   * 
   * @param page 分页插件查询信息
   */
  public void setPageInfo(Page<?> page) {
    this.setPageInfo(page.getTotal(), page.getPageSize(), page.getPageNum(), page.getPages());
  }

  /**
   * 设置分页信息
   * 
   * @param page 分页插件查询信息
   */
  public void setPageInfo(PageInfo<?> page) {
    this.setPageInfo(page.getTotal(), page.getPageSize(), page.getPageNum(), page.getPages());
  }

  /**
   * 设置分页信息
   * 
   * @param total      记录总数
   * @param pageSize   分页大小
   * @param pageNumber 页码
   * @param pageCount  页数
   */
  public void setPageInfo(long total, Integer pageSize, Integer pageNumber, Integer pageCount) {
    this.total = total;
    this.pageSize = pageSize;
    this.pageNumber = pageNumber;
    this.pageCount = pageCount;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

}
