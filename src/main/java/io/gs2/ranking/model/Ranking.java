package io.gs2.ranking.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ランキング
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Ranking implements Serializable {

	/** インデックス */
	Long index;
	/** 順位 */
	Long rank;
	/** ユーザID */
	String userId;
	/** スコア */
	Integer score;
	/** メタ情報 */
	String meta;
	/** 更新日時 */
	Integer updateAt;
	
	/**
	 * インデックスを取得
	 * 
	 * @return インデックス
	 */
	public Long getIndex() {
		return index;
	}
	
	/**
	 * インデックスを設定
	 * 
	 * @param index インデックス
	 */
	public void setIndex(Long index) {
		this.index = index;
	}
	
	/**
	 * 順位を取得
	 * 
	 * @return 順位
	 */
	public Long getRank() {
		return rank;
	}
	
	/**
	 * 順位を設定
	 * 
	 * @param rank 順位
	 */
	public void setRank(Long rank) {
		this.rank = rank;
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
