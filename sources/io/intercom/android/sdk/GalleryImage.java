package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010 \u001a\u00020\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÇ\u0001J\b\u0010-\u001a\u00020\nH\u0007J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u000100H×\u0003J\t\u00101\u001a\u00020\nH×\u0001J\t\u00102\u001a\u00020\u0003H×\u0001J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00068"}, m18302d2 = {"Lio/intercom/android/sdk/GalleryImage;", "Landroid/os/Parcelable;", "fileName", "", "mimeType", "uri", "Landroid/net/Uri;", "previewPath", "attribution", "imageWidth", "", "imageHeight", "fileSize", "isGif", "", "isVideo", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getMimeType", "getUri", "()Landroid/net/Uri;", "getPreviewPath", "getAttribution", "getImageWidth", "()I", "getImageHeight", "getFileSize", "()Z", "getDuration", "getImageWidthXHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class GalleryImage implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();

    @NotNull
    private final String attribution;

    @NotNull
    private final String duration;

    @NotNull
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;

    @NotNull
    private final String mimeType;

    @NotNull
    private final String previewPath;

    @NotNull
    private final Uri uri;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage createFromParcel(Parcel parcel) {
            boolean z2;
            Intrinsics.m18599g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(GalleryImage.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
            return new GalleryImage(string, string2, uri, string3, string4, i, i2, i3, z3, parcel.readInt() == 0 ? z2 : true, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage[] newArray(int i) {
            return new GalleryImage[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GalleryImage createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GalleryImage[] newArray(int i) {
            return newArray(i);
        }
    }

    @JvmOverloads
    public GalleryImage() {
        this(null, null, null, null, null, 0, 0, 0, false, false, null, 2047, null);
    }

    public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z2, boolean z3, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = galleryImage.fileName;
        }
        if ((i4 & 2) != 0) {
            str2 = galleryImage.mimeType;
        }
        if ((i4 & 4) != 0) {
            uri = galleryImage.uri;
        }
        if ((i4 & 8) != 0) {
            str3 = galleryImage.previewPath;
        }
        if ((i4 & 16) != 0) {
            str4 = galleryImage.attribution;
        }
        if ((i4 & 32) != 0) {
            i = galleryImage.imageWidth;
        }
        if ((i4 & 64) != 0) {
            i2 = galleryImage.imageHeight;
        }
        if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            i3 = galleryImage.fileSize;
        }
        if ((i4 & 256) != 0) {
            z2 = galleryImage.isGif;
        }
        if ((i4 & 512) != 0) {
            z3 = galleryImage.isVideo;
        }
        if ((i4 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str5 = galleryImage.duration;
        }
        boolean z4 = z3;
        String str6 = str5;
        int i5 = i3;
        boolean z5 = z2;
        int i6 = i;
        int i7 = i2;
        String str7 = str4;
        Uri uri2 = uri;
        return galleryImage.copy(str, str2, uri2, str3, str7, i6, i7, i5, z5, z4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviewPath() {
        return this.previewPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAttribution() {
        return this.attribution;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getImageWidth() {
        return this.imageWidth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getImageHeight() {
        return this.imageHeight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsGif() {
        return this.isGif;
    }

    @NotNull
    public final GalleryImage copy(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int imageWidth, int imageHeight, int fileSize, boolean isGif, boolean isVideo, @NotNull String duration) {
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
        Intrinsics.m18599g(duration, "duration");
        return new GalleryImage(fileName, mimeType, uri, previewPath, attribution, imageWidth, imageHeight, fileSize, isGif, isVideo, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryImage)) {
            return false;
        }
        GalleryImage galleryImage = (GalleryImage) other;
        return Intrinsics.m18594b(this.fileName, galleryImage.fileName) && Intrinsics.m18594b(this.mimeType, galleryImage.mimeType) && Intrinsics.m18594b(this.uri, galleryImage.uri) && Intrinsics.m18594b(this.previewPath, galleryImage.previewPath) && Intrinsics.m18594b(this.attribution, galleryImage.attribution) && this.imageWidth == galleryImage.imageWidth && this.imageHeight == galleryImage.imageHeight && this.fileSize == galleryImage.fileSize && this.isGif == galleryImage.isGif && this.isVideo == galleryImage.isVideo && Intrinsics.m18594b(this.duration, galleryImage.duration);
    }

    @NotNull
    public final String getAttribution() {
        return this.attribution;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    @NotNull
    public final String getImageWidthXHeight() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.imageWidth);
        sb.append('x');
        sb.append(this.imageHeight);
        return sb.toString();
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getPreviewPath() {
        return this.previewPath;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.duration.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.fileSize, AbstractC0455a.m2228c(this.imageHeight, AbstractC0455a.m2228c(this.imageWidth, AbstractC0000a.m5b(AbstractC0000a.m5b((this.uri.hashCode() + AbstractC0000a.m5b(this.fileName.hashCode() * 31, 31, this.mimeType)) * 31, 31, this.previewPath), 31, this.attribution), 31), 31), 31), 31, this.isGif), 31, this.isVideo);
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GalleryImage(fileName=");
        sb.append(this.fileName);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", previewPath=");
        sb.append(this.previewPath);
        sb.append(", attribution=");
        sb.append(this.attribution);
        sb.append(", imageWidth=");
        sb.append(this.imageWidth);
        sb.append(", imageHeight=");
        sb.append(this.imageHeight);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", isGif=");
        sb.append(this.isGif);
        sb.append(", isVideo=");
        sb.append(this.isVideo);
        sb.append(", duration=");
        return AbstractC0455a.m2241p(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.fileName);
        dest.writeString(this.mimeType);
        dest.writeParcelable(this.uri, flags);
        dest.writeString(this.previewPath);
        dest.writeString(this.attribution);
        dest.writeInt(this.imageWidth);
        dest.writeInt(this.imageHeight);
        dest.writeInt(this.fileSize);
        dest.writeInt(this.isGif ? 1 : 0);
        dest.writeInt(this.isVideo ? 1 : 0);
        dest.writeString(this.duration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName) {
        this(fileName, null, null, null, null, 0, 0, 0, false, false, null, 2046, null);
        Intrinsics.m18599g(fileName, "fileName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType) {
        this(fileName, mimeType, null, null, null, 0, 0, 0, false, false, null, 2044, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri) {
        this(fileName, mimeType, uri, null, null, 0, 0, 0, false, false, null, 2040, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath) {
        this(fileName, mimeType, uri, previewPath, null, 0, 0, 0, false, false, null, 2032, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution) {
        this(fileName, mimeType, uri, previewPath, attribution, 0, 0, 0, false, false, null, 2016, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i) {
        this(fileName, mimeType, uri, previewPath, attribution, i, 0, 0, false, false, null, 1984, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i, int i2) {
        this(fileName, mimeType, uri, previewPath, attribution, i, i2, 0, false, false, null, 1920, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i, int i2, int i3) {
        this(fileName, mimeType, uri, previewPath, attribution, i, i2, i3, false, false, null, 1792, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i, int i2, int i3, boolean z2) {
        this(fileName, mimeType, uri, previewPath, attribution, i, i2, i3, z2, false, null, 1536, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i, int i2, int i3, boolean z2, boolean z3) {
        this(fileName, mimeType, uri, previewPath, attribution, i, i2, i3, z2, z3, null, UserMetadata.MAX_ATTRIBUTE_SIZE, null);
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
    }

    @JvmOverloads
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i, int i2, int i3, boolean z2, boolean z3, @NotNull String duration) {
        Intrinsics.m18599g(fileName, "fileName");
        Intrinsics.m18599g(mimeType, "mimeType");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(previewPath, "previewPath");
        Intrinsics.m18599g(attribution, "attribution");
        Intrinsics.m18599g(duration, "duration");
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.uri = uri;
        this.previewPath = previewPath;
        this.attribution = attribution;
        this.imageWidth = i;
        this.imageHeight = i2;
        this.fileSize = i3;
        this.isGif = z2;
        this.isVideo = z3;
        this.duration = duration;
    }

    public /* synthetic */ GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z2, boolean z3, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? Uri.EMPTY : uri, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0 : i3, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? "" : str5);
    }
}
