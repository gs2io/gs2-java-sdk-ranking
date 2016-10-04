package io.gs2.ranking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * 自分の順位の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetMyRankRequest extends Gs2UserRequest<GetMyRankRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "GetMyRank";
	}

	/** ランキングテーブル名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;

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
	public GetMyRankRequest withRankingTableName(String rankingTableName) {
		setRankingTableName(rankingTableName);
		return this;
	}

	/**
	 * ゲームモードを取得。
	 * 
	 * @return ゲームモード
	 */
	public String getGameMode() {
		return gameMode;
	}
	
	/**
	 * ゲームモードを設定。
	 * 
	 * @param gameMode ゲームモード
	 */
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	/**
	 * ゲームモードを設定。
	 * 
	 * @param gameMode ゲームモード
	 * @return this
	 */
	public GetMyRankRequest withGameMode(String gameMode) {
		setGameMode(gameMode);
		return this;
	}
}
