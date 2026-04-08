package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "T", "", "<init>", "()V", "Success", "ServerError", "NetworkError", "ClientError", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ClientError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$NetworkError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ServerError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$Success;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class NetworkResponse<T> {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ClientError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ClientError extends NetworkResponse {
        public static final int $stable = 8;

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientError(@NotNull Throwable error) {
            super(null);
            Intrinsics.m18599g(error, "error");
            this.error = error;
        }

        public static /* synthetic */ ClientError copy$default(ClientError clientError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = clientError.error;
            }
            return clientError.copy(th);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final ClientError copy(@NotNull Throwable error) {
            Intrinsics.m18599g(error, "error");
            return new ClientError(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientError) && Intrinsics.m18594b(this.error, ((ClientError) other).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClientError(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$NetworkError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/io/IOException;", "<init>", "(Ljava/io/IOException;)V", "getError", "()Ljava/io/IOException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class NetworkError extends NetworkResponse {
        public static final int $stable = 8;

        @NotNull
        private final IOException error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull IOException error) {
            super(null);
            Intrinsics.m18599g(error, "error");
            this.error = error;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, IOException iOException, int i, Object obj) {
            if ((i & 1) != 0) {
                iOException = networkError.error;
            }
            return networkError.copy(iOException);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IOException getError() {
            return this.error;
        }

        @NotNull
        public final NetworkError copy(@NotNull IOException error) {
            Intrinsics.m18599g(error, "error");
            return new NetworkError(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && Intrinsics.m18594b(this.error, ((NetworkError) other).error);
        }

        @NotNull
        public final IOException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkError(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0004H×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ServerError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "code", "", "<init>", "(I)V", "getCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ServerError extends NetworkResponse {
        public static final int $stable = 0;
        private final int code;

        public ServerError(int i) {
            super(null);
            this.code = i;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = serverError.code;
            }
            return serverError.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final ServerError copy(int code) {
            return new ServerError(code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ServerError) && this.code == ((ServerError) other).code;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        @NotNull
        public String toString() {
            return AbstractC0000a.m17n(new StringBuilder("ServerError(code="), this.code, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÇ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$Success;", "T", "", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "body", "<init>", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$Success;", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Success<T> extends NetworkResponse<T> {
        public static final int $stable = 0;

        @NotNull
        private final T body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull T body) {
            super(null);
            Intrinsics.m18599g(body, "body");
            this.body = body;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.body;
            }
            return success.copy(obj);
        }

        @NotNull
        public final T component1() {
            return this.body;
        }

        @NotNull
        public final Success<T> copy(@NotNull T body) {
            Intrinsics.m18599g(body, "body");
            return new Success<>(body);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.m18594b(this.body, ((Success) other).body);
        }

        @NotNull
        public final T getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(body=" + this.body + ')';
        }
    }

    public /* synthetic */ NetworkResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkResponse() {
    }
}
