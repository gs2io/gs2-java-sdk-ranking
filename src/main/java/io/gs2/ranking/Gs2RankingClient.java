package io.gs2.ranking;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.auth.Gs2AuthClient;
import io.gs2.model.IGs2Credential;
import io.gs2.ranking.control.CreateGameModeRequest;
import io.gs2.ranking.control.CreateGameModeResult;
import io.gs2.ranking.control.CreateRankingTableRequest;
import io.gs2.ranking.control.CreateRankingTableResult;
import io.gs2.ranking.control.DeleteGameModeRequest;
import io.gs2.ranking.control.DeleteRankingTableRequest;
import io.gs2.ranking.control.DescribeGameModeRequest;
import io.gs2.ranking.control.DescribeGameModeResult;
import io.gs2.ranking.control.DescribeRankingTableRequest;
import io.gs2.ranking.control.DescribeRankingTableResult;
import io.gs2.ranking.control.GetEstimateRankRequest;
import io.gs2.ranking.control.GetEstimateRankResult;
import io.gs2.ranking.control.GetGameModeRequest;
import io.gs2.ranking.control.GetGameModeResult;
import io.gs2.ranking.control.GetMyRankRequest;
import io.gs2.ranking.control.GetMyRankResult;
import io.gs2.ranking.control.GetRankingRequest;
import io.gs2.ranking.control.GetRankingResult;
import io.gs2.ranking.control.GetRankingTableRequest;
import io.gs2.ranking.control.GetRankingTableResult;
import io.gs2.ranking.control.PutScoreRequest;
import io.gs2.ranking.control.PutScoreResult;
import io.gs2.ranking.control.UpdateGameModeRequest;
import io.gs2.ranking.control.UpdateGameModeResult;
import io.gs2.ranking.control.UpdateRankingTableRequest;
import io.gs2.ranking.control.UpdateRankingTableResult;

/**
 * GS2-Ranking API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2RankingClient extends AbstractGs2Client<Gs2RankingClient> {

	public static String ENDPOINT = "ranking";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2RankingClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * ランキングテーブルを作成。<br>
	 * <br>
	 * GS2-Ranking を利用するには、まずランキングテーブルを作成する必要があります。<br>
	 * 1つのランキングテーブルには複数のゲームモードのランキングを格納することができます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateRankingTableResult createRankingTable(CreateRankingTableRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/ranking", 
				credential, 
				ENDPOINT,
				CreateRankingTableRequest.Constant.MODULE, 
				CreateRankingTableRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateRankingTableResult.class);
	}
	
	/**
	 * ランキングテーブル一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ランキングテーブル一覧
	 */
	public DescribeRankingTableResult describeRankingTable(DescribeRankingTableRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/ranking";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeRankingTableRequest.Constant.MODULE, 
				DescribeRankingTableRequest.Constant.FUNCTION);
		return doRequest(get, DescribeRankingTableResult.class);
	}

	/**
	 * ランキングテーブルを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ランキングテーブル
	 */
	public GetRankingTableResult getRankingTable(GetRankingTableRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName(), 
				credential, 
				ENDPOINT,
				GetRankingTableRequest.Constant.MODULE, 
				GetRankingTableRequest.Constant.FUNCTION);
		return doRequest(get, GetRankingTableResult.class);
	}

	/**
	 * ランキングテーブルを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateRankingTableResult updateRankingTable(UpdateRankingTableRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName(), 
				credential, 
				ENDPOINT,
				UpdateRankingTableRequest.Constant.MODULE, 
				UpdateRankingTableRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateRankingTableResult.class);
	}

	/**
	 * ランキングテーブルを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteRankingTable(DeleteRankingTableRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName(), 
				credential, 
				ENDPOINT,
				DeleteRankingTableRequest.Constant.MODULE, 
				DeleteRankingTableRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * ゲームモードを作成。<br>
	 * <br>
	 * ゲームモードを作成すると、ゲームモードの設定としてランキングが昇順なのか、降順なのかを設定できます。<br>
	 * レースゲームのようなタイムの値が小さいほど上位のランキングの場合は昇順を、<br>
	 * アクションゲームなどで、スコアの値が大きいほど上位のランキングの場合は降順を選択します。<br>
	 * <br>
	 * 他に、集計間隔を15分以上、24時間以下で分単位で設定できます。<br>
	 * ランキングを更新したい間隔に合わせて設定することになります。<br>
	 * 集計処理毎に費用が発生するため、高頻度であればあるほど利用料金は高くなります。<br>
	 * <br>
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateGameModeResult createGameMode(CreateGameModeRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("gameMode", request.getGameMode())
				.put("asc", request.getAsc())
				.put("calcInterval", request.getCalcInterval());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode", 
				credential, 
				ENDPOINT,
				CreateGameModeRequest.Constant.MODULE, 
				CreateGameModeRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateGameModeResult.class);
	}
	
	/**
	 * ゲームモード一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ゲームモード一覧
	 */
	public DescribeGameModeResult describeGameMode(DescribeGameModeRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeGameModeRequest.Constant.MODULE, 
				DescribeGameModeRequest.Constant.FUNCTION);
		return doRequest(get, DescribeGameModeResult.class);
	}

	/**
	 * ゲームモードを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ゲームモード
	 */
	public GetGameModeResult getGameMode(GetGameModeRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode(), 
				credential, 
				ENDPOINT,
				GetGameModeRequest.Constant.MODULE, 
				GetGameModeRequest.Constant.FUNCTION);
		return doRequest(get, GetGameModeResult.class);
	}

	/**
	 * ゲームモードを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateGameModeResult updateGameMode(UpdateGameModeRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("calcInterval", request.getCalcInterval());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode(), 
				credential, 
				ENDPOINT,
				UpdateGameModeRequest.Constant.MODULE, 
				UpdateGameModeRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateGameModeResult.class);
	}

	/**
	 * ゲームモードを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteGameMode(DeleteGameModeRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode(), 
				credential, 
				ENDPOINT,
				DeleteGameModeRequest.Constant.MODULE, 
				DeleteGameModeRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * ランキングを取得。<br>
	 * <br>
	 * ランキングを取得します。<br>
	 * ランキングにはユーザID、スコア、メタデータといった基本情報のほかに、インデックスと順位が付加されています。<br>
	 * インデックスは先頭を1とした位置情報で、順位は同一スコアのユーザを同一順位として計算された値です。<br>
	 * ランキングの性質上、同一スコアでも別順位として扱いたい場合は順位の代わりにインデックスを利用することで実現できます。<br>
	 * <br>
	 * ランキングデータはランダムアクセスができますので、{@link Gs2RankingClient#getMyRank(GetMyRankRequest)} で自分の順位を取得して、<br>
	 * その前後のランキンデータを取得する。というような処理も実現できます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 取得結果
	 */
	public GetRankingResult getRanking(GetRankingRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode() + "/ranking";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getOffset() != null) queryString.add(new BasicNameValuePair("offset", String.valueOf(request.getOffset())));
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				GetRankingRequest.Constant.MODULE, 
				GetRankingRequest.Constant.FUNCTION);
		return doRequest(get, GetRankingResult.class);
	}

	/**
	 * スコアを登録。<br>
	 * <br>
	 * スコアの登録は一時的にバッファリングされ、定期的にランキングデータとして書き込まれます。<br>
	 * そのため、スコア登録直後にランキング集計が開始された場合は、集計結果に含まれない可能性があります。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 登録結果
	 */
	public PutScoreResult putScore(PutScoreRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("score", request.getScore())
				.put("meta", request.getMeta());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode() + "/ranking", 
				credential, 
				ENDPOINT,
				PutScoreRequest.Constant.MODULE, 
				PutScoreRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, PutScoreResult.class);
	}

	/**
	 * 自分の順位を取得。<br>
	 * <br>
	 * 自分の順位を取得できます、応答される値は集計時点での正確な値となります。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 取得結果
	 */
	public GetMyRankResult getMyRank(GetMyRankRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode() + "/ranking/rank", 
				credential, 
				ENDPOINT,
				GetMyRankRequest.Constant.MODULE, 
				GetMyRankRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, GetMyRankResult.class);
	}

	/**
	 * スコアを指定しておおよその順位を取得。<br>
	 * <br>
	 * 指定したスコアを取ったと仮定して何位ぐらいになれるのか、といった指標を計算する際に利用します。<br>
	 * 原則1000位単位でおおよその順位を応答します。<br>
	 * <br>
	 * 上位プレイヤーに対しては1000位単位の解像度では情報が不足している場合があると思いますので、<br>
	 * 応答が上位プレイヤーだった場合は、更に {@link Gs2RankingClient#getRanking(GetRankingRequest)} で上位のスコアを取得して<br>
	 * さらに詳細な順位に絞り込んで情報提供する。というのもユーザ体験をよく出来ると思います。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 取得結果
	 */
	public GetEstimateRankResult getEstimateRank(GetEstimateRankRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/ranking/" + request.getRankingTableName() + "/mode/" + request.getGameMode() + "/ranking/estimate";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getScore() != null) queryString.add(new BasicNameValuePair("score", String.valueOf(request.getScore())));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				GetEstimateRankRequest.Constant.MODULE, 
				GetEstimateRankRequest.Constant.FUNCTION);
		return doRequest(get, GetEstimateRankResult.class);
	}

}
