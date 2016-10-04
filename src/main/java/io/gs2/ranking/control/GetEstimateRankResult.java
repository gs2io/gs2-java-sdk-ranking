package io.gs2.ranking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * おおよその順位取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetEstimateRankResult {

	Long min;
	Long max;

	/**
	 * おおよその最小順位を取得。
	 * 
	 * @return おおよその最小順位
	 */
	public Long getMin() {
		return min;
	}

	/**
	 * おおよその最小順位を設定。
	 * 
	 * @param min おおよその最小順位
	 */
	public void setMin(Long min) {
		this.min = min;
	}

	/**
	 * おおよその最大順位を取得。
	 * 
	 * @return おおよその最大順位
	 */
	public Long getMax() {
		return max;
	}

	/**
	 * おおよその最大順位を設定。
	 * 
	 * @param max おおよその最大順位
	 */
	public void setMax(Long max) {
		this.max = max;
	}
}
