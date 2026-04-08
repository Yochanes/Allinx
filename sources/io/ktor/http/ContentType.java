package io.ktor.http;

import com.engagelab.privates.push.constants.MTPushConstants;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lio/ktor/http/ContentType;", "Lio/ktor/http/HeaderValueWithParameters;", "Application", "Audio", "Companion", "Image", "Message", "MultiPart", "Text", "Video", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ContentType extends HeaderValueWithParameters {

    /* JADX INFO: renamed from: e */
    public static final ContentType f45585e = new ContentType(Marker.ANY_MARKER, Marker.ANY_MARKER, EmptyList.f51496a);

    /* JADX INFO: renamed from: c */
    public final String f45586c;

    /* JADX INFO: renamed from: d */
    public final String f45587d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Application;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Application {

        /* JADX INFO: renamed from: a */
        public static final ContentType f45588a;

        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType("application", Marker.ANY_MARKER, emptyList);
            new ContentType("application", "atom+xml", emptyList);
            new ContentType("application", "cbor", emptyList);
            new ContentType("application", MTPushConstants.Analysis.KEY_JSON, emptyList);
            new ContentType("application", "hal+json", emptyList);
            new ContentType("application", "javascript", emptyList);
            f45588a = new ContentType("application", "octet-stream", emptyList);
            new ContentType("application", "font-woff", emptyList);
            new ContentType("application", "rss+xml", emptyList);
            new ContentType("application", "xml", emptyList);
            new ContentType("application", "xml-dtd", emptyList);
            new ContentType("application", "zip", emptyList);
            new ContentType("application", "gzip", emptyList);
            new ContentType("application", "x-www-form-urlencoded", emptyList);
            new ContentType("application", "pdf", emptyList);
            new ContentType("application", "protobuf", emptyList);
            new ContentType("application", "wasm", emptyList);
            new ContentType("application", "problem+json", emptyList);
            new ContentType("application", "problem+xml", emptyList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Audio;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Audio {
        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType("audio", Marker.ANY_MARKER, emptyList);
            new ContentType("audio", "mp4", emptyList);
            new ContentType("audio", "mpeg", emptyList);
            new ContentType("audio", "ogg", emptyList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static ContentType m16948a(String str) throws BadContentTypeFormatException {
            if (StringsKt.m20448x(str)) {
                return ContentType.f45585e;
            }
            HeaderValue headerValue = (HeaderValue) CollectionsKt.m18437j0(HttpHeaderValueParserKt.m16968a(str));
            String str2 = headerValue.f45649b;
            int iM20445u = StringsKt.m20445u(str2, '/', 0, 6);
            if (iM20445u == -1) {
                if (Intrinsics.m18594b(StringsKt.m20430b0(str2).toString(), Marker.ANY_MARKER)) {
                    return ContentType.f45585e;
                }
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            String strSubstring = str2.substring(0, iM20445u);
            Intrinsics.m18598f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String string = StringsKt.m20430b0(strSubstring).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            String strSubstring2 = str2.substring(iM20445u + 1);
            Intrinsics.m18598f(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            String string2 = StringsKt.m20430b0(strSubstring2).toString();
            if (string2.length() == 0 || StringsKt.m20435k(string2, '/')) {
                throw new BadContentTypeFormatException("Bad Content-Type format: ".concat(str));
            }
            return new ContentType(string, string2, headerValue.f45650c);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Image;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Image {
        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType(AppearanceType.IMAGE, Marker.ANY_MARKER, emptyList);
            new ContentType(AppearanceType.IMAGE, "gif", emptyList);
            new ContentType(AppearanceType.IMAGE, "jpeg", emptyList);
            new ContentType(AppearanceType.IMAGE, "png", emptyList);
            new ContentType(AppearanceType.IMAGE, "svg+xml", emptyList);
            new ContentType(AppearanceType.IMAGE, "x-icon", emptyList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Message;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Message {
        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType("message", Marker.ANY_MARKER, emptyList);
            new ContentType("message", "http", emptyList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$MultiPart;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class MultiPart {
        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType("multipart", Marker.ANY_MARKER, emptyList);
            new ContentType("multipart", "mixed", emptyList);
            new ContentType("multipart", "alternative", emptyList);
            new ContentType("multipart", "related", emptyList);
            new ContentType("multipart", "form-data", emptyList);
            new ContentType("multipart", "signed", emptyList);
            new ContentType("multipart", "encrypted", emptyList);
            new ContentType("multipart", "byteranges", emptyList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Text;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Text {

        /* JADX INFO: renamed from: a */
        public static final ContentType f45589a;

        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType(AttributeType.TEXT, Marker.ANY_MARKER, emptyList);
            f45589a = new ContentType(AttributeType.TEXT, "plain", emptyList);
            new ContentType(AttributeType.TEXT, "css", emptyList);
            new ContentType(AttributeType.TEXT, "csv", emptyList);
            new ContentType(AttributeType.TEXT, "html", emptyList);
            new ContentType(AttributeType.TEXT, "javascript", emptyList);
            new ContentType(AttributeType.TEXT, "vcard", emptyList);
            new ContentType(AttributeType.TEXT, "xml", emptyList);
            new ContentType(AttributeType.TEXT, "event-stream", emptyList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentType$Video;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Video {
        static {
            EmptyList emptyList = EmptyList.f51496a;
            new ContentType("video", Marker.ANY_MARKER, emptyList);
            new ContentType("video", "mpeg", emptyList);
            new ContentType("video", "mp4", emptyList);
            new ContentType("video", "ogg", emptyList);
            new ContentType("video", "quicktime", emptyList);
        }
    }

    public ContentType(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f45586c = str;
        this.f45587d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ContentType)) {
            return false;
        }
        ContentType contentType = (ContentType) obj;
        if (StringsKt.m20442r(this.f45586c, contentType.f45586c, true) && StringsKt.m20442r(this.f45587d, contentType.f45587d, true)) {
            return Intrinsics.m18594b(this.f45654b, contentType.f45654b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f45586c;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.m18598f(lowerCase, "(this as java.lang.String).toLowerCase()");
        int iHashCode = lowerCase.hashCode();
        int i = iHashCode * 31;
        String str2 = this.f45587d;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase2 = str2.toLowerCase();
        Intrinsics.m18598f(lowerCase2, "(this as java.lang.String).toLowerCase()");
        return (this.f45654b.hashCode() * 31) + lowerCase2.hashCode() + i + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.m18599g(contentType, "contentType");
        Intrinsics.m18599g(contentSubtype, "contentSubtype");
        Intrinsics.m18599g(parameters, "parameters");
    }
}
