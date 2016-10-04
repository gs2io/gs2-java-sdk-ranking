package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ゲームモードの更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateGameModeRequest extends Gs2BasicRequest<UpdateGameModeRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "UpdateGameMode";
	}

	/** ゲームモード名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;
	/** 集計間隔(分) */
	Integer calcInterval;
	
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
	public UpdateGameModeRequest withRankingTableName(String rankingTableName) {
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
	public UpdateGameModeRequest withGameMode(String gameMode) {
		setGameMode(gameMode);
		return this;
	}

	/**
	 * 集計間隔(分)を取得。
	 * 
	 * @return 集計間隔(分)
	 */
	public Integer getCalcInterval() {
		return calcInterval;
	}
	
	/**
	 * 集計間隔(分)を設定。
	 * 
	 * @param calcInterval 集計間隔(分)
	 */
	public void setCalcInterval(Integer calcInterval) {
		this.calcInterval = calcInterval;
	}
	
	/**
	 * 集計間隔(分)を設定。
	 * 
	 * @param calcInterval 集計間隔(分)
	 * @return this
	 */
	public UpdateGameModeRequest withCalcInterval(Integer calcInterval) {
		setCalcInterval(calcInterval);
		return this;
	}
}
