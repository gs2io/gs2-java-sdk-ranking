package io.gs2.ranking.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * スコア
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Score implements Serializable {

	/** ランキングテーブルID */
	String rankingTableId;
	/** ゲームモード */
	String gameMode;
	/** ユーザID */
	String userId;
	/** スコア */
	Integer score;
	/** メタ情報 */
	String meta;
	/** 更新日時 */
	Integer updateAt;
	
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
	 * ユーザIDを取得
	 * 
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * ユーザIDを設定
	 * 
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * スコアを取得
	 * 
	 * @return スコア
	 */
	public Integer getScore() {
		return score;
	}
	
	/**
	 * スコアを設定
	 * 
	 * @param score スコア
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
	
	/**
	 * メタデータを取得
	 * 
	 * @return メタデータ
	 */
	public String getMeta() {
		return meta;
	}
	
	/**
	 * メタデータを設定
	 * 
	 * @param meta メタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	/**
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param updateAt 更新日時
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}
}
