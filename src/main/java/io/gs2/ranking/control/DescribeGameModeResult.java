package io.gs2.ranking.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.control.DescribeGameModeRequest;
import io.gs2.ranking.model.GameMode;

/**
 * ゲームモード一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeGameModeResult {

	/** ゲームモード一覧 */
	List<GameMode> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したゲームモード数を取得。
	 * 
	 * @return 取得したゲームモード数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したゲームモード一覧を取得。
	 * 
	 * @return ゲームモード一覧
	 */
	public List<GameMode> getItems() {
		return items;
	}
	
	/**
	 * ゲームモード一覧を設定。
	 * 
	 * @param items ゲームモード一覧
	 */
	public void setItems(List<GameMode> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeGameModeRequest} に指定することで、次のページを取得できます。
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
