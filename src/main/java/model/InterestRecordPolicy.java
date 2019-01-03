package model;

public class InterestRecordPolicy {
    private Long id;

    private Long recordId;

    private String applicantIdType;

    private String applicantIdNum;

    private String insuredIdType;

    private String insuredIdNum;

    private String agentCode;

    private String agentName;

    private String applicantName;

    private String insuredName;

    private String sellChannel;

    private String policyNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getApplicantIdType() {
        return applicantIdType;
    }

    public void setApplicantIdType(String applicantIdType) {
        this.applicantIdType = applicantIdType == null ? null : applicantIdType.trim();
    }

    public String getApplicantIdNum() {
        return applicantIdNum;
    }

    public void setApplicantIdNum(String applicantIdNum) {
        this.applicantIdNum = applicantIdNum == null ? null : applicantIdNum.trim();
    }

    public String getInsuredIdType() {
        return insuredIdType;
    }

    public void setInsuredIdType(String insuredIdType) {
        this.insuredIdType = insuredIdType == null ? null : insuredIdType.trim();
    }

    public String getInsuredIdNum() {
        return insuredIdNum;
    }

    public void setInsuredIdNum(String insuredIdNum) {
        this.insuredIdNum = insuredIdNum == null ? null : insuredIdNum.trim();
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName == null ? null : insuredName.trim();
    }

    public String getSellChannel() {
        return sellChannel;
    }

    public void setSellChannel(String sellChannel) {
        this.sellChannel = sellChannel == null ? null : sellChannel.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }
}