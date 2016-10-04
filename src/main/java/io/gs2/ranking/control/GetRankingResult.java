package io.gs2.ranking.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.Ranking;

/**
 * ランキング取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetRankingResult {

	/** ランキング */
	List<Ranking> items;
	
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
	 * 取得したランキングを取得。
	 * 
	 * @return ランキング
	 */
	public List<Ranking> getItems() {
		return items;
	}
	
	/**
	 * ランキングを設定。
	 * 
	 * @param items ランキング
	 */
	public void setItems(List<Ranking> items) {
		this.items = items;
	}
}
