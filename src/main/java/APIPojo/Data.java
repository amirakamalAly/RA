package APIPojo;

public class Data {
	private String jobId;

	private String gx;

	private String gy;

	private String requesterTypeId;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getGx() {
		return gx;
	}

	public void setGx(String gx) {
		this.gx = gx;
	}

	public String getGy() {
		return gy;
	}

	public void setGy(String gy) {
		this.gy = gy;
	}

	public String getRequesterTypeId() {
		return requesterTypeId;
	}

	public void setRequesterTypeId(String requesterTypeId) {
		this.requesterTypeId = requesterTypeId;
	}

	@Override
	public String toString() {
		return "ClassPojo [jobId = " + jobId + ", gx = " + gx + ", gy = " + gy + ", requesterTypeId = "
				+ requesterTypeId + "]";
	}
}
