package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ゲームモードの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateGameModeRequest extends Gs2BasicRequest<CreateGameModeRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "CreateGameMode";
	}

	/** ランキングテーブル名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;
	/** ソート方向 */
	Boolean asc;
	/** 集計間隔(分) */
	Integer calcInterval;
	
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
	public CreateGameModeRequest withRankingTableName(String rankingTableName) {
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
	public CreateGameModeRequest withGameMode(String gameMode) {
		setGameMode(gameMode);
		return this;
	}

	/**
	 * ソート方向を取得。
	 * 
	 * @return ソート方向
	 */
	public Boolean getAsc() {
		return asc;
	}
	
	/**
	 * ソート方向を設定。
	 * 
	 * @param asc ソート方向
	 */
	public void setAsc(Boolean asc) {
		this.asc = asc;
	}
	
	/**
	 * ソート方向を設定。
	 * 
	 * @param asc ソート方向
	 * @return this
	 */
	public CreateGameModeRequest withAsc(Boolean asc) {
		setAsc(asc);
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
	public CreateGameModeRequest withCalcInterval(Integer calcInterval) {
		setCalcInterval(calcInterval);
		return this;
	}

}
