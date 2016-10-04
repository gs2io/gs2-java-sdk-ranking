package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ランキングテーブルの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteRankingTableRequest extends Gs2BasicRequest<DeleteRankingTableRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "DeleteRankingTable";
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
	public DeleteRankingTableRequest withRankingTableName(String rankingTableName) {
		setRankingTableName(rankingTableName);
		return this;
	}
}
