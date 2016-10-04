package io.gs2.ranking.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.RankingTable;

/**
 * ランキングテーブル一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeRankingTableResult {

	/** ランキングテーブル一覧 */
	List<RankingTable> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したランキングテーブル数を取得。
	 * 
	 * @return 取得したランキングテーブル数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したランキングテーブル一覧を取得。
	 * 
	 * @return ランキングテーブル一覧
	 */
	public List<RankingTable> getItems() {
		return items;
	}
	
	/**
	 * ランキングテーブル一覧を設定。
	 * 
	 * @param items ランキングテーブル一覧
	 */
	public void setItems(List<RankingTable> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeRankingTableRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
