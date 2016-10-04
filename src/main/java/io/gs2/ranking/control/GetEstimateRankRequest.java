package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * おおよその順位の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetEstimateRankRequest extends Gs2BasicRequest<GetEstimateRankRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "GetEstimateRank";
	}

	/** ランキングテーブル名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;
	/** スコア */
	Integer score;

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
	public GetEstimateRankRequest withRankingTableName(String rankingTableName) {
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
	public GetEstimateRankRequest withGameMode(String gameMode) {
		setGameMode(gameMode);
		return this;
	}
	
	/**
	 * スコアを取得。
	 * 
	 * @return スコア
	 */
	public Integer getScore() {
		return score;
	}
	
	/**
	 * スコアを設定。
	 * 
	 * @param score スコア
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
	
	/**
	 * スコアを設定。
	 * 
	 * @param score スコア
	 * @return this
	 */
	public GetEstimateRankRequest withScore(Integer score) {
		setScore(score);
		return this;
	}
}
