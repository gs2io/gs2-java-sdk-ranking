package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.RankingTable;

/**
 * ランキングテーブルの更新結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UpdateRankingTableResult {
	
	RankingTable item;
	
	/**
	 * ランキングテーブルを取得。
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
	
	/**
	 * ランキングテーブルを設定。
	 * 
	 * @param item ランキングテーブル
	 * @return this
	 */
	public UpdateRankingTableResult withItem(RankingTable item) {
		setItem(item);
		return this;
	}
}
