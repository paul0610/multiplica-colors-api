package com.multiplica.colors.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public final class RespBase<T> {

	private Trace trace;
	private Status status;
	@JsonInclude(content = Include.NON_NULL)
	private T payload;

	public RespBase() {
		super();
		trace =  new Trace();
		status = new Status();
	}

	public Trace getTrace() {
		return trace;
	}

	public void setTrace(Trace trace) {
		this.trace = trace;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "RespBase [" + (trace != null ? "trace=" + trace + ", " : "")
				+ (status != null ? "status=" + status + ", " : "") + (payload != null ? "payload=" + payload : "")
				+ "]";
	}

	public static class Trace {

		private String traceId;

		public String getTraceId() {
			return traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		@Override
		public String toString() {
			return "Trace [" + (traceId != null ? "traceId=" + traceId : "") + "]";
		}
	}

	public static class Status {
		private Boolean success;
		private Error error;

		public Status() {
			super();
			error = new Error();
		}

		public Boolean getSuccess() {
			return success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public Error getError() {
			return error;
		}

		public void setError(Error error) {
			this.error = error;
		}

		@Override
		public String toString() {
			return "Status [" + (success != null ? "success=" + success + ", " : "")
					+ (error != null ? "error=" + error : "") + "]";
		}

		public static class Error {

			private String code;
			private String httpCode;
			private List<String> messages;

			public Error() {
				super();
				messages = new ArrayList<>();
			}

			public String getCode() {
				return code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getHttpCode() {
				return httpCode;
			}

			public void setHttpCode(String httpCode) {
				this.httpCode = httpCode;
			}

			public List<String> getMessages() {
				return messages;
			}

			public void setMessages(List<String> messages) {
				this.messages = messages;
			}

			@Override
			public String toString() {
				return "Error [" + (code != null ? "code=" + code + ", " : "")
						+ (httpCode != null ? "httpCode=" + httpCode + ", " : "")
						+ (messages != null ? "messages=" + messages : "") + "]";
			}

		}
	}

	public RespBase<T> PayloadOK(T payload) {
		RespBase<T> response = new RespBase<>();
		response.setPayload(payload);
		response.getStatus().setSuccess(Boolean.TRUE);
		return response;
	}
	public RespBase<T> RequestPayloadOK(T request) {
		setPayload(request);
		getStatus().setSuccess(Boolean.TRUE);
		return this;
	}
}
