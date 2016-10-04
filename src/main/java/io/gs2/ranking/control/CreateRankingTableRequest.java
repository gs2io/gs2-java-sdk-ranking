package io.gs2.ranking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.ranking.Gs2Ranking;

/**
 * ランキングテーブルの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateRankingTableRequest extends Gs2BasicRequest<CreateRankingTableRequest> {

	public static class Constant extends Gs2Ranking.Constant {
		public static final String FUNCTION = "CreateRankingTable";
	}
	
	/** ランキングテーブル名 */
	String name;
	/** 説明文 */
	String description;
	
	/**
	 * ランキングテーブル名を取得。
	 * 
	 * @return ランキングテーブル名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ランキングテーブル名を設定。
	 * 
	 * @param name ランキングテーブル名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ランキングテーブル名を設定。
	 * 
	 * @param name ランキングテーブル名
	 * @return this
	 */
	public CreateRankingTableRequest withName(String name) {
		setName(name);
		return this;
	}
	
	/**
	 * 説明文を取得。
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 * @return this
	 */
	public CreateRankingTableRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

}
