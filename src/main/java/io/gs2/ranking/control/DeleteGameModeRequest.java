package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ゲームモードの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteGameModeRequest extends Gs2BasicRequest<DeleteGameModeRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "DeleteGameMode";
	}

	/** ランキングテーブル名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;

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
	public DeleteGameModeRequest withRankingTableName(String rankingTableName) {
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
	public DeleteGameModeRequest withGameMode(String gameMode) {
		setGameMode(gameMode);
		return this;
	}
}
