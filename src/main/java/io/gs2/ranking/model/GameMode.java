package io.gs2.ranking.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ゲームモード
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class GameMode implements Serializable {

	/** ゲームモードID */
	String gameModeId;
	/** ランキングテーブルID */
	String rankingTableId;
	/** ゲームモード */
	String gameMode;
	/** オーナーID */
	String ownerId;
	/** ソート方向 */
	Boolean asc;
	/** 集計間隔(分) */
	Integer calcInterval;
	/** 最終週計日時 */
	Long lastCalcAt;
	/** 登録日時 */
	Long createAt;
	/** 更新日時 */
	Long updateAt;
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public String getGameModeId() {
		return gameModeId;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setGameModeId(String gameModeId) {
		this.gameModeId = gameModeId;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public String getRankingTableId() {
		return rankingTableId;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setRankingTableId(String rankingTableId) {
		this.rankingTableId = rankingTableId;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public String getGameMode() {
		return gameMode;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public Boolean getAsc() {
		return asc;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setAsc(Boolean asc) {
		this.asc = asc;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public Integer getCalcInterval() {
		return calcInterval;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setCalcInterval(Integer calcInterval) {
		this.calcInterval = calcInterval;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public Long getLastCalcAt() {
		return lastCalcAt;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setLastCalcAt(Long lastCalcAt) {
		this.lastCalcAt = lastCalcAt;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
	
	/**
	 * ゲームモードIDを取得
	 * 
	 * @return ゲームモードID
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * ゲームモードIDを設定
	 * 
	 * @param gameModeId ゲームモードID
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}
