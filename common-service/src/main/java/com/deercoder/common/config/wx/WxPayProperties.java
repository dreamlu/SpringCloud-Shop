package com.deercoder.common.config.wx;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 微信支付提现--配置
 */
@Data
@ConfigurationProperties(prefix = "wx.pay")
public class WxPayProperties {

	private List<Config> configs;

	@Data
	public static class Config {
		/**
		 * 设置微信公众号或者小程序等的appid
		 */
		private String appId;

		/**
		 * 微信支付商户号
		 */
		private String mchId;

		/**
		 * 微信支付商户密钥
		 */
		private String mchKey;

		/**
		 * 服务商模式下的子商户公众账号ID，普通模式请不要配置，请在配置文件中将对应项删除
		 */
		private String subAppId;

		/**
		 * 服务商模式下的子商户号，普通模式请不要配置，最好是请在配置文件中将对应项删除
		 */
		private String subMchId;

		/**
		 * apiclient_cert.p12文件的绝对路径，或者如果放在项目中，请以classpath:开头指定
		 */
		private String keyPath;

		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this,
					ToStringStyle.MULTI_LINE_STYLE);
		}
	}

}