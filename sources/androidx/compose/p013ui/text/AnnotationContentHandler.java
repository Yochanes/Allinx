package androidx.compose.p013ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotationContentHandler;", "Lorg/xml/sax/ContentHandler;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AnnotationContentHandler implements ContentHandler {

    /* JADX INFO: renamed from: a */
    public final ContentHandler f19906a;

    /* JADX INFO: renamed from: b */
    public final Editable f19907b;

    /* JADX INFO: renamed from: c */
    public int f19908c;

    /* JADX INFO: renamed from: d */
    public BulletSpanWithLevel f19909d;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.f19906a = contentHandler;
        this.f19907b = editable;
    }

    /* JADX INFO: renamed from: a */
    public final void m6353a() {
        BulletSpanWithLevel bulletSpanWithLevel = this.f19909d;
        if (bulletSpanWithLevel != null) {
            Editable editable = this.f19907b;
            editable.setSpan(bulletSpanWithLevel, bulletSpanWithLevel.f19925c, editable.length(), 33);
        }
        this.f19909d = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.f19906a.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f19906a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        m6353a();
                        this.f19908c--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    m6353a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.f19907b;
                Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((AnnotationSpan) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i);
                    int spanStart = editable.getSpanStart(annotationSpan);
                    int length = editable.length();
                    editable.removeSpan(annotationSpan);
                    if (spanStart != length) {
                        editable.setSpan(annotationSpan, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.f19906a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f19906a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.f19906a.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f19906a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f19906a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f19906a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f19906a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            Editable editable = this.f19907b;
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        m6353a();
                        this.f19908c++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    m6353a();
                    this.f19909d = new BulletSpanWithLevel(BulletKt.f19922a, this.f19908c, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i = 0; i < length; i++) {
                        String localName = attributes.getLocalName(i);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new AnnotationSpan(), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.f19906a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f19906a.startPrefixMapping(str, str2);
    }
}
