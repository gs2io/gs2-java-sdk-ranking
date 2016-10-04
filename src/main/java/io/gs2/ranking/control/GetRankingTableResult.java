package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.RankingTable;

/**
 * ランキングテーブル取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetRankingTableResult {

	/** ランキングテーブル */
	RankingTable item;
	
	/**
	 * 取得したランキングテーブルを取得。
	 * 
	 * @return ランキングテーブル
	 */
	public RankingTable getItem() {
		return item;
	}
	
	/**
	 * ランキングテーブルを設定。
	 * 
	 * @param item ランキングテーブル
	 */
	public void setItem(RankingTable item) {
		this.item = item;
	}
}
