package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.Score;

/**
 * スコアの登録結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PutScoreResult {
	
	Score item;
	
	/**
	 * ゲームモードを取得。
	 * 
	 * @return ゲームモード
	 */
	public Score getItem() {
		return item;
	}
	
	/**
	 * ゲームモードを設定。
	 * 
	 * @param item ゲームモード
	 */
	public void setItem(Score item) {
		this.item = item;
	}
	
	/**
	 * ゲームモードを設定。
	 * 
	 * @param item ゲームモード
	 * @return this
	 */
	public PutScoreResult withItem(Score item) {
		setItem(item);
		return this;
	}
}
