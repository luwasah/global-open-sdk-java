package com.alipay.global.api.model.ams;

public class PaymentFactor {

    private Boolean                isPaymentEvaluation;
    private InStorePaymentScenario inStorePaymentScenario;
    private PresentmentMode        presentmentMode;

    public Boolean getIsPaymentEvaluation() {
        return isPaymentEvaluation;
    }

    public void setIsPaymentEvaluation(Boolean isPaymentEvaluation) {
        this.isPaymentEvaluation = isPaymentEvaluation;
    }

    public InStorePaymentScenario getInStorePaymentScenario() {
        return inStorePaymentScenario;
    }

    public void setInStorePaymentScenario(InStorePaymentScenario inStorePaymentScenario) {
        this.inStorePaymentScenario = inStorePaymentScenario;
    }

    public PresentmentMode getPresentmentMode() {
        return presentmentMode;
    }

    public void setPresentmentMode(PresentmentMode presentmentMode) {
        this.presentmentMode = presentmentMode;
    }
}
