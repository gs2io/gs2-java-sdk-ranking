package io.gs2.ranking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * スコアの登録リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class PutScoreRequest extends Gs2UserRequest<PutScoreRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "PutScore";
	}

	/** ゲームモード名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;
	/** スコア */
	Integer score;
	/** メタデータ */
	String meta;
	
	/**
	 * ゲームモード名を取得。
	 * 
	 * @return ゲームモード名
	 */
	public String getRankingTableName() {
		return rankingTableName;
	}
	
	/**
	 * ゲームモード名を設定。
	 * 
	 * @param rankingTableName ゲームモード名
	 */
	public void setRankingTableName(String rankingTableName) {
		this.rankingTableName = rankingTableName;
	}
	
	/**
	 * ゲームモード名を設定。
	 * 
	 * @param rankingTableName ゲームモード名
	 * @return this
	 */
	public PutScoreRequest withRankingTableName(String rankingTableName) {
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
	public PutScoreRequest withGameMode(String gameMode) {
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
	public PutScoreRequest withScore(Integer score) {
		setScore(score);
		return this;
	}

	/**
	 * メタデータを取得。
	 * 
	 * @return メタデータ
	 */
	public String getMeta() {
		return meta;
	}
	
	/**
	 * メタデータを設定。
	 * 
	 * @param meta メタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	/**
	 * メタデータを設定。
	 * 
	 * @param meta メタデータ
	 * @return this
	 */
	public PutScoreRequest withMeta(String meta) {
		setMeta(meta);
		return this;
	}
}
