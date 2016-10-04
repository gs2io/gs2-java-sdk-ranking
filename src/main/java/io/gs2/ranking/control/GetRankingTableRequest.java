package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ランキングテーブルの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetRankingTableRequest extends Gs2BasicRequest<GetRankingTableRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "GetRankingTable";
	}
	
	/** ランキングテーブル名 */
	String rankingTableName;
	
	/**
	 * ランキングテーブル名を取得。
	 * 
	 * @return ランキングテーブル名
	 */
	public String getRankingTableName() {
		return rankingTableName;
	}
	
	/**
	 * ランキングテーブル名を設定。
	 * 
	 * @param rankingTableName ランキングテーブル名
	 */
	public void setRankingTableName(String rankingTableName) {
		this.rankingTableName = rankingTableName;
	}
	
	/**
	 * ランキングテーブル名を設定。
	 * 
	 * @param rankingTableName ランキングテーブル名
	 * @return this
	 */
	public GetRankingTableRequest withRankingTableName(String rankingTableName) {
		setRankingTableName(rankingTableName);
		return this;
	}
}
