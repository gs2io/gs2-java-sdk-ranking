/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.ranking.model;

import java.util.List;
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

	/** 集計処理中か否か */
	private Boolean calculating;

	/** 集計間隔(分) */
	private Integer calcInterval;

	/** 最終集計日時(エポック秒) */
	private Integer lastCalcAt;

	/** ゲームモード名 */
	private String gameMode;

	/** ゲームモードGRN */
	private String gameModeId;

	/** ランキング計算に昇順を適用するか */
	private Boolean asc;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** ランキングテーブル */
	private String rankingTableId;

	/** オーナーID */
	private String ownerId;

	/** 更新日時(エポック秒) */
	private Integer updateAt;


	/**
	 * 集計処理中か否かを取得
	 *
	 * @return 集計処理中か否か
	 */
	public Boolean getCalculating() {
		return calculating;
	}

	/**
	 * 集計処理中か否かを設定
	 *
	 * @param calculating 集計処理中か否か
	 */
	public void setCalculating(Boolean calculating) {
		this.calculating = calculating;
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
	 * 最終集計日時(エポック秒)を取得
	 *
	 * @return 最終集計日時(エポック秒)
	 */
	public Integer getLastCalcAt() {
		return lastCalcAt;
	}

	/**
	 * 最終集計日時(エポック秒)を設定
	 *
	 * @param lastCalcAt 最終集計日時(エポック秒)
	 */
	public void setLastCalcAt(Integer lastCalcAt) {
		this.lastCalcAt = lastCalcAt;
	}

	/**
	 * ゲームモード名を取得
	 *
	 * @return ゲームモード名
	 */
	public String getGameMode() {
		return gameMode;
	}

	/**
	 * ゲームモード名を設定
	 *
	 * @param gameMode ゲームモード名
	 */
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	/**
	 * ゲームモードGRNを取得
	 *
	 * @return ゲームモードGRN
	 */
	public String getGameModeId() {
		return gameModeId;
	}

	/**
	 * ゲームモードGRNを設定
	 *
	 * @param gameModeId ゲームモードGRN
	 */
	public void setGameModeId(String gameModeId) {
		this.gameModeId = gameModeId;
	}

	/**
	 * ランキング計算に昇順を適用するかを取得
	 *
	 * @return ランキング計算に昇順を適用するか
	 */
	public Boolean getAsc() {
		return asc;
	}

	/**
	 * ランキング計算に昇順を適用するかを設定
	 *
	 * @param asc ランキング計算に昇順を適用するか
	 */
	public void setAsc(Boolean asc) {
		this.asc = asc;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * ランキングテーブルを取得
	 *
	 * @return ランキングテーブル
	 */
	public String getRankingTableId() {
		return rankingTableId;
	}

	/**
	 * ランキングテーブルを設定
	 *
	 * @param rankingTableId ランキングテーブル
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
	 * 更新日時(エポック秒)を取得
	 *
	 * @return 更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 更新日時(エポック秒)を設定
	 *
	 * @param updateAt 更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

}