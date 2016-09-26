package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PayoutBatch extends PayPalModel {

	/**
	 * A batch header. Includes the generated batch status.
	 */
	private PayoutBatchHeader batchHeader;

	/**
	 * An array of items in a batch payout.
	 */
	private List<PayoutItemDetails> items;

	/**
	 * @deprecated This property is unused
	 */
	@Deprecated
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public PayoutBatch() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PayoutBatch(PayoutBatchHeader batchHeader, List<PayoutItemDetails> items) {
		this.batchHeader = batchHeader;
		this.items = items;
	}
}
