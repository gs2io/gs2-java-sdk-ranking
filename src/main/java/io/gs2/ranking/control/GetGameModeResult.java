package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.GameMode;

/**
 * ゲームモード取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetGameModeResult {

	/** ゲームモード */
	GameMode item;
	
	/**
	 * 取得したゲームモードを取得。
	 * 
	 * @return ゲームモード
	 */
	public GameMode getItem() {
		return item;
	}
	
	/**
	 * ゲームモードを設定。
	 * 
	 * @param item ゲームモード
	 */
	public void setItem(GameMode item) {
		this.item = item;
	}
}
