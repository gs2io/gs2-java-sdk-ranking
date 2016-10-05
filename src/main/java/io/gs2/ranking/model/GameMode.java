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

	/** ランキングテーブルID */
	String rankingTableId;
	/** ゲームモードID */
	String gameModeId;
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
	 * ランキングテーブルIDを取得
	 * 
	 * @return ランキングテーブルID
	 */
	public String getRankingTableId() {
		return rankingTableId;
	}
	
	/**
	 * ランキングテーブルIDを設定
	 * 
	 * @param rankingTableId ランキングテーブルID
	 */
	public void setRankingTableId(String rankingTableId) {
		this.rankingTableId = rankingTableId;
	}
	
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
	 * ゲームモードを取得
	 * 
	 * @return ゲームモード
	 */
	public String getGameMode() {
		return gameMode;
	}
	
	/**
	 * ゲームモードを設定
	 * 
	 * @param gameMode ゲームモード
	 */
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * ソート方向を取得
	 * 
	 * @return ソート方向
	 */
	public Boolean getAsc() {
		return asc;
	}
	
	/**
	 * ソート方向を設定
	 * 
	 * @param asc ソート方向
	 */
	public void setAsc(Boolean asc) {
		this.asc = asc;
	}
	
	/**
	 * 集計間隔(分)を取得
	 * 
	 * @return 集計間隔(分)
	 */
	public Integer getCalcInterval() {
		return calcInterval;
	}
	
	/**
	 * 集計間隔(分)を設定
	 * 
	 * @param calcInterval 集計間隔(分)
	 */
	public void setCalcInterval(Integer calcInterval) {
		this.calcInterval = calcInterval;
	}
	
	/**
	 * 最終集計時間を取得
	 * 
	 * @return 最終集計時間
	 */
	public Long getLastCalcAt() {
		return lastCalcAt;
	}
	
	/**
	 * 最終集計時間を設定
	 * 
	 * @param lastCalcAt 最終集計時間
	 */
	public void setLastCalcAt(Long lastCalcAt) {
		this.lastCalcAt = lastCalcAt;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
	
	/**
	 * 最終更新日時を取得
	 * 
	 * @return 最終更新日時
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 最終更新日時を設定
	 * 
	 * @param updateAt 最終更新日時
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}
