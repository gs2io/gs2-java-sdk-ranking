package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.ranking.model.GameMode;

/**
 * ゲームモードの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateGameModeResult {
	
	GameMode item;
	
	/**
	 * ゲームモードを取得。
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
	
	/**
	 * ゲームモードを設定。
	 * 
	 * @param item ゲームモード
	 * @return this
	 */
	public CreateGameModeResult withItem(GameMode item) {
		setItem(item);
		return this;
	}
}
