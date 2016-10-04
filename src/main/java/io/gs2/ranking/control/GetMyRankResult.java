package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 自分の順位取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetMyRankResult {

	/** インデックス */
	Long index;
	/** 順位 */
	Long rank;

	/**
	 * インデックスを取得。
	 * 
	 * @return インデックス
	 */
	public Long getIndex() {
		return index;
	}

	/**
	 * インデックスを設定。
	 * 
	 * @param index インデックス
	 */
	public void setIndex(Long index) {
		this.index = index;
	}
	
	/**
	 * 順位を取得。
	 * 
	 * @return 順位
	 */
	public Long getRank() {
		return rank;
	}

	/**
	 * 順位を設定。
	 * 
	 * @param rank 順位
	 */
	public void setRank(Long rank) {
		this.rank = rank;
	}
}
