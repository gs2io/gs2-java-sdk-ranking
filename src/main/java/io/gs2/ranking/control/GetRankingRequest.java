package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ランキングの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetRankingRequest extends Gs2BasicRequest<GetRankingRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "GetRanking";
	}

	/** ランキングテーブル名 */
	String rankingTableName;
	/** ゲームモード */
	String gameMode;
	/** 取得開始位置 */
	Integer offset;
	/** 取得件数 */
	Integer limit;

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
	public GetRankingRequest withRankingTableName(String rankingTableName) {
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
	public GetRankingRequest withGameMode(String gameMode) {
		setGameMode(gameMode);
		return this;
	}
	
	/**
	 * 取得開始位置を取得。
	 * 
	 * @return 取得開始位置
	 */
	public Integer getOffset() {
		return offset;
	}
	
	/**
	 * 取得開始位置を設定。
	 * 
	 * @param offset 取得開始位置
	 */
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
	/**
	 * 取得開始位置を設定。
	 * 
	 * @param offset 取得開始位置
	 * @return this
	 */
	public GetRankingRequest withOffset(Integer offset) {
		setOffset(offset);
		return this;
	}

	/**
	 * 取得件数を取得。
	 * 
	 * @return 取得件数
	 */
	public Integer getLimit() {
		return limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 * @return this
	 */
	public GetRankingRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
