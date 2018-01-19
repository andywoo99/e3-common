package cn.e3mall.common.pojo;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable {
private int totalPage;
private int totalCount;
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}
public int getTotalCount() {
	return totalCount;
}
public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
}
public List<SearchItem> getSearchItemList() {
	return searchItemList;
}
public void setSearchItemList(List<SearchItem> searchItemList) {
	this.searchItemList = searchItemList;
}
private List<SearchItem> searchItemList;

}
