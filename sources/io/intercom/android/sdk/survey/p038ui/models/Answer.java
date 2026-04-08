package io.intercom.android.sdk.survey.p038ui.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import defpackage.C0023a;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.p032m5.conversation.p033ui.components.composer.MediaData;
import io.intercom.android.sdk.p041ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;
import p005F.C0013a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer;", "", "<init>", "()V", "getLength", "", "DateTimeAnswer", "SingleAnswer", "MultipleAnswer", "NoAnswer", "MediaAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class Answer {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", AttributeType.DATE, "", "hours", "", "minutes", "<init>", "(JII)V", "getDate", "()J", "getHours", "()I", "getMinutes", "getLength", "getLocalTime", "", "getDateAsString", "getAnswer", "formatTime", "time", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public DateTimeAnswer(long j, int i, int i2) {
            super(null);
            this.date = j;
            this.hours = i;
            this.minutes = i2;
        }

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = dateTimeAnswer.date;
            }
            if ((i3 & 2) != 0) {
                i = dateTimeAnswer.hours;
            }
            if ((i3 & 4) != 0) {
                i2 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j, i, i2);
        }

        private final String formatTime(int time) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            if (time < 0) {
                time = 0;
            }
            String str = decimalFormat.format(Integer.valueOf(time));
            Intrinsics.m18598f(str, "format(...)");
            return str;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHours() {
            return this.hours;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        @NotNull
        public final DateTimeAnswer copy(long date, int hours, int minutes) {
            return new DateTimeAnswer(date, hours, minutes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) other;
            return this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes;
        }

        @NotNull
        public final String getAnswer() {
            StringBuilder sb = new StringBuilder();
            sb.append(getDateAsString());
            sb.append('T');
            sb.append(formatTime(this.hours));
            sb.append(':');
            return AbstractC0000a.m19p(sb, formatTime(this.minutes), ":00Z");
        }

        public final long getDate() {
            return this.date;
        }

        @NotNull
        public final String getDateAsString() {
            long j = this.date;
            if (j == -1) {
                return "";
            }
            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j, "YYYY-MM-dd");
            Intrinsics.m18598f(timeInMillisAsDate, "formatTimeInMillisAsDate(...)");
            return timeInMillisAsDate;
        }

        public final int getHours() {
            return this.hours;
        }

        @Override // io.intercom.android.sdk.survey.p038ui.models.Answer
        public int getLength() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.date);
            sb.append(this.hours);
            sb.append(this.minutes);
            return sb.toString().length();
        }

        @NotNull
        public final String getLocalTime() {
            int i;
            int i2 = this.hours;
            if (i2 == -1 || (i = this.minutes) == -1) {
                return "";
            }
            String fromUtcTime = TimeFormatter.formatFromUtcTime(i2, i);
            Intrinsics.m18598f(fromUtcTime, "formatFromUtcTime(...)");
            return fromUtcTime;
        }

        public final int getMinutes() {
            return this.minutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutes) + AbstractC0455a.m2228c(this.hours, Long.hashCode(this.date) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("DateTimeAnswer(date=");
            sb.append(this.date);
            sb.append(", hours=");
            sb.append(this.hours);
            sb.append(", minutes=");
            return AbstractC0000a.m17n(sb, this.minutes, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\nH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "mediaItems", "", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "<init>", "(Ljava/util/List;)V", "getMediaItems", "()Ljava/util/List;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "MediaItem", "FileUploadStatus", "FileUploadError", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class MediaAnswer extends Answer {
        public static final int $stable = 8;

        @NotNull
        private final List<MediaItem> mediaItems;

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0017\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "", "errorMessages", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "getErrorMessages", "()Ljava/util/List;", "UploadFailed", "FileLimitExceeded", "UnsupportedFileType", "FileTooLarge", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static abstract class FileUploadError {
            public static final int $stable = 8;

            @NotNull
            private final List<StringProvider.StringRes> errorMessages;

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.m18599g(message, "message");
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileTooLarge(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.m18599g(message, "message");
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.m18599g(message, "message");
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFailed(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.m18599g(message, "message");
                }
            }

            public /* synthetic */ FileUploadError(List list, DefaultConstructorMarker defaultConstructorMarker) {
                this(list);
            }

            @NotNull
            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "", "<init>", "()V", "None", "Queued", "Uploading", "Success", "Error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "<init>", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;)V", "getError", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final /* data */ class Error extends FileUploadStatus {
                public static final int $stable = 8;

                @NotNull
                private final FileUploadError error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull FileUploadError error) {
                    super(null);
                    Intrinsics.m18599g(error, "error");
                    this.error = error;
                }

                public static /* synthetic */ Error copy$default(Error error, FileUploadError fileUploadError, int i, Object obj) {
                    if ((i & 1) != 0) {
                        fileUploadError = error.error;
                    }
                    return error.copy(fileUploadError);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final FileUploadError getError() {
                    return this.error;
                }

                @NotNull
                public final Error copy(@NotNull FileUploadError error) {
                    Intrinsics.m18599g(error, "error");
                    return new Error(error);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Error) && Intrinsics.m18594b(this.error, ((Error) other).error);
                }

                @NotNull
                public final FileUploadError getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Error(error=" + this.error + ')';
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;

                @NotNull
                public static final None INSTANCE = new None();

                private None() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;

                @NotNull
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final /* data */ class Success extends FileUploadStatus {
                public static final int $stable = 0;
                private final int id;

                public Success(int i) {
                    super(null);
                    this.id = i;
                }

                public static /* synthetic */ Success copy$default(Success success, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = success.id;
                    }
                    return success.copy(i);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getId() {
                    return this.id;
                }

                @NotNull
                public final Success copy(int id) {
                    return new Success(id);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Success) && this.id == ((Success) other).id;
                }

                public final int getId() {
                    return this.id;
                }

                public int hashCode() {
                    return Integer.hashCode(this.id);
                }

                @NotNull
                public String toString() {
                    return AbstractC0000a.m17n(new StringBuilder("Success(id="), this.id, ')');
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;

                @NotNull
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super(null);
                }
            }

            public /* synthetic */ FileUploadStatus(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private FileUploadStatus() {
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u001fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "", "data", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "getData", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<set-?>", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "_uploadStatus", "get_uploadStatus", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "set_uploadStatus", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;)V", "_uploadStatus$delegate", "Landroidx/compose/runtime/MutableState;", "uploadStatus", "getUploadStatus", "uploadStatus$delegate", "Landroidx/compose/runtime/State;", "setUploadStatus", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final /* data */ class MediaItem {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: _uploadStatus$delegate, reason: from kotlin metadata */
            @NotNull
            private final MutableState _uploadStatus;

            @NotNull
            private final MediaData.Media data;

            /* JADX INFO: renamed from: uploadStatus$delegate, reason: from kotlin metadata */
            @NotNull
            private final State uploadStatus;

            public MediaItem(@NotNull MediaData.Media data) {
                Intrinsics.m18599g(data, "data");
                this.data = data;
                this._uploadStatus = SnapshotStateKt.m4525g(FileUploadStatus.None.INSTANCE);
                this.uploadStatus = SnapshotStateKt.m4523e(new C0013a(this, 0));
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ FileUploadStatus m16432a(MediaItem mediaItem) {
                return uploadStatus_delegate$lambda$0(mediaItem);
            }

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i, Object obj) {
                if ((i & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            private final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus.getF20325a();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus.setValue(fileUploadStatus);
            }

            private static final FileUploadStatus uploadStatus_delegate$lambda$0(MediaItem this$0) {
                Intrinsics.m18599g(this$0, "this$0");
                return this$0.get_uploadStatus();
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MediaData.Media getData() {
                return this.data;
            }

            @NotNull
            public final MediaItem copy(@NotNull MediaData.Media data) {
                Intrinsics.m18599g(data, "data");
                return new MediaItem(data);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MediaItem) && Intrinsics.m18594b(this.data, ((MediaItem) other).data);
            }

            @NotNull
            public final MediaData.Media getData() {
                return this.data;
            }

            @NotNull
            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus.getF20325a();
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public final void setUploadStatus(@NotNull FileUploadStatus uploadStatus) {
                Intrinsics.m18599g(uploadStatus, "uploadStatus");
                set_uploadStatus(uploadStatus);
            }

            @NotNull
            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAnswer(@NotNull List<MediaItem> mediaItems) {
            super(null);
            Intrinsics.m18599g(mediaItems, "mediaItems");
            this.mediaItems = mediaItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        @NotNull
        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        @NotNull
        public final MediaAnswer copy(@NotNull List<MediaItem> mediaItems) {
            Intrinsics.m18599g(mediaItems, "mediaItems");
            return new MediaAnswer(mediaItems);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MediaAnswer) && Intrinsics.m18594b(this.mediaItems, ((MediaAnswer) other).mediaItems);
        }

        @Override // io.intercom.android.sdk.survey.p038ui.models.Answer
        public int getLength() {
            return this.mediaItems.size();
        }

        @NotNull
        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2242q(new StringBuilder("MediaAnswer(mediaItems="), this.mediaItems, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0012H×\u0001J\t\u0010\u001b\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answers", "", "", "otherAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "(Ljava/util/Set;Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;)V", "getAnswers", "()Ljava/util/Set;", "getOtherAnswer", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "copyWithAnswerToggled", "answer", "copyWithOther", "", "getLength", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "OtherAnswer", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class MultipleAnswer extends Answer {
        public static final int $stable = 8;

        @NotNull
        private final Set<String> answers;

        @NotNull
        private final OtherAnswer otherAnswer;

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "", "<init>", "()V", "toString", "", "NotSelected", "SelectedNoText", "SelectedWithText", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;

                @NotNull
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;

                @NotNull
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", AttributeType.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final /* data */ class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;

                @NotNull
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedWithText(@NotNull String text) {
                    super(null);
                    Intrinsics.m18599g(text, "text");
                    this.text = text;
                }

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @NotNull
                public final SelectedWithText copy(@NotNull String text) {
                    Intrinsics.m18599g(text, "text");
                    return new SelectedWithText(text);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SelectedWithText) && Intrinsics.m18594b(this.text, ((SelectedWithText) other).text);
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @Override // io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer
                @NotNull
                public String toString() {
                    return this.text;
                }
            }

            public /* synthetic */ OtherAnswer(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public String toString() {
                return "";
            }

            private OtherAnswer() {
            }
        }

        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer otherAnswer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : otherAnswer);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ CharSequence m16433a(String str) {
            return getLength$lambda$1(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set set, OtherAnswer otherAnswer, int i, Object obj) {
            if ((i & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i & 2) != 0) {
                otherAnswer = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer);
        }

        private static final CharSequence getLength$lambda$1(String it) {
            Intrinsics.m18599g(it, "it");
            return it;
        }

        @NotNull
        public final Set<String> component1() {
            return this.answers;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        @NotNull
        public final MultipleAnswer copy(@NotNull Set<String> answers, @NotNull OtherAnswer otherAnswer) {
            Intrinsics.m18599g(answers, "answers");
            Intrinsics.m18599g(otherAnswer, "otherAnswer");
            return new MultipleAnswer(answers, otherAnswer);
        }

        @NotNull
        public final Answer copyWithAnswerToggled(@NotNull String answer) {
            Intrinsics.m18599g(answer, "answer");
            LinkedHashSet linkedHashSetM18397A0 = CollectionsKt.m18397A0(this.answers);
            if (this.answers.contains(answer)) {
                linkedHashSetM18397A0.remove(answer);
            } else {
                linkedHashSetM18397A0.add(answer);
            }
            return (linkedHashSetM18397A0.isEmpty() && (this.otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, linkedHashSetM18397A0, null, 2, null);
        }

        @NotNull
        public final Answer copyWithOther(@NotNull OtherAnswer otherAnswer) {
            Intrinsics.m18599g(otherAnswer, "otherAnswer");
            return (this.answers.isEmpty() && (otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, null, otherAnswer, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) other;
            return Intrinsics.m18594b(this.answers, multipleAnswer.answers) && Intrinsics.m18594b(this.otherAnswer, multipleAnswer.otherAnswer);
        }

        @NotNull
        /* JADX INFO: renamed from: getAnswers, reason: collision with other method in class */
        public final Set<String> m22454getAnswers() {
            return this.answers;
        }

        @Override // io.intercom.android.sdk.survey.p038ui.models.Answer
        public int getLength() {
            return CollectionsKt.m18409J(this.answers, null, null, null, new C0023a(1), 31).length();
        }

        @NotNull
        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public int hashCode() {
            return this.otherAnswer.hashCode() + (this.answers.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        @NotNull
        public final List<String> getAnswers() {
            ListBuilder listBuilderM18460v = CollectionsKt.m18460v();
            listBuilderM18460v.addAll(CollectionsKt.m18465x0(this.answers));
            OtherAnswer otherAnswer = this.otherAnswer;
            if (!Intrinsics.m18594b(otherAnswer, OtherAnswer.NotSelected.INSTANCE)) {
                if (Intrinsics.m18594b(otherAnswer, OtherAnswer.SelectedNoText.INSTANCE)) {
                    listBuilderM18460v.add("Other");
                } else {
                    if (!(otherAnswer instanceof OtherAnswer.SelectedWithText)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listBuilderM18460v.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                }
            }
            return CollectionsKt.m18450q(listBuilderM18460v);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(@NotNull Set<String> answers, @NotNull OtherAnswer otherAnswer) {
            super(null);
            Intrinsics.m18599g(answers, "answers");
            Intrinsics.m18599g(otherAnswer, "otherAnswer");
            this.answers = answers;
            this.otherAnswer = otherAnswer;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0002\b\t¨\u0006\n"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "<init>", "()V", "getLength", "", "InitialNoAnswer", "ResetNoAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;

            @NotNull
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;

            @NotNull
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super(null);
            }
        }

        public /* synthetic */ NoAnswer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.intercom.android.sdk.survey.p038ui.models.Answer
        public int getLength() {
            return 0;
        }

        private NoAnswer() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\tH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "", "<init>", "(Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class SingleAnswer extends Answer {
        public static final int $stable = 0;

        @NotNull
        private final String answer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAnswer(@NotNull String answer) {
            super(null);
            Intrinsics.m18599g(answer, "answer");
            this.answer = answer;
        }

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        @NotNull
        public final SingleAnswer copy(@NotNull String answer) {
            Intrinsics.m18599g(answer, "answer");
            return new SingleAnswer(answer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SingleAnswer) && Intrinsics.m18594b(this.answer, ((SingleAnswer) other).answer);
        }

        @NotNull
        public final String getAnswer() {
            return this.answer;
        }

        @Override // io.intercom.android.sdk.survey.p038ui.models.Answer
        public int getLength() {
            return this.answer.length();
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("SingleAnswer(answer="), this.answer, ')');
        }
    }

    public /* synthetic */ Answer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getLength();

    private Answer() {
    }
}
