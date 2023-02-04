package APIPojo;

public class Location {

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

	private String access_token;

	private Data[] data;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Data[] getData() {
		return data;
	}

	public void setData(Data[] data) {
		this.data = data;
	}

@Override
public String toString()
{
return "ClassPojo [access_token = "+access_token+", data = "+data+"]";
}

public void setData(String latitude, String longitude, String joborderId, String requesterTypeId) {
	// TODO Auto-generated method stub
	
	Data locationcordinates = new Data();
	locationcordinates.setGx(latitude);
	locationcordinates.setGy(longitude);
	locationcordinates.setJobId(joborderId);
	locationcordinates.setRequesterTypeId(requesterTypeId);

}
}