package io.gs2.ranking.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ランキングテーブル
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class RankingTable implements Serializable {

	/** ランキングテーブルID */
	String rankingTableId;
	/** オーナーID */
	String ownerId;
	/** 名前 */
	String name;
	/** 説明 */
	String description;
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
	 * ランキングテーブル名を取得
	 * 
	 * @return ランキングテーブル名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ランキングテーブル名を設定
	 * 
	 * @param name ランキングテーブル名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 説明文を取得
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param updateAt 更新日時
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}
