package io.intercom.android.sdk.lightcompressor.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.aspectj.runtime.reflect.Factory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.AudioSpecificConfig;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.DecoderConfigDescriptor;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.SLConfigDescriptor;
import org.mp4parser.boxes.iso14496.part12.SampleDescriptionBox;
import org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox;
import org.mp4parser.boxes.iso14496.part14.ESDescriptorBox;
import org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox;
import org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord;
import org.mp4parser.boxes.sampleentry.AudioSampleEntry;
import org.mp4parser.boxes.sampleentry.VisualSampleEntry;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010#\u001a\u00020\u000bJ\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(J\u001b\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`*¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\u0011J\u0006\u0010.\u001a\u00020\u0013J\b\u0010/\u001a\u0004\u0018\u000100J\u0006\u00101\u001a\u00020\u0003J\u0006\u00102\u001a\u00020\u0018J\u0006\u00103\u001a\u00020\u0003J\u0006\u00104\u001a\u00020\u0003J\u0006\u00105\u001a\u00020\u001cJ\u001b\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\rj\b\u0012\u0004\u0012\u00020\u000b`*¢\u0006\u0002\u0010+J\u0006\u0010\u001e\u001a\u00020\u0007J\f\u00107\u001a\u000208*\u000208H\u0002J\u001c\u00107\u001a\u000209*\u0002092\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0003H\u0002J\u0014\u00107\u001a\u00020<*\u00020<2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Track;", "", "id", "", "format", "Landroid/media/MediaFormat;", "audio", "", "<init>", "(ILandroid/media/MediaFormat;Z)V", "trackId", "", "samples", "Ljava/util/ArrayList;", "Lio/intercom/android/sdk/lightcompressor/video/Sample;", "duration", "handler", "", "sampleDescriptionBox", "Lorg/mp4parser/boxes/iso14496/part12/SampleDescriptionBox;", "syncSamples", "Ljava/util/LinkedList;", "timeScale", "creationTime", "Ljava/util/Date;", "height", "width", "volume", "", "sampleDurations", "isAudio", "samplingFrequencyIndexMap", "", "lastPresentationTimeUs", "first", "getTrackId", "addSample", "", "offset", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "getSamples", "Lkotlin/collections/ArrayList;", "()Ljava/util/ArrayList;", "getDuration", "getHandler", "getSampleDescriptionBox", "getSyncSamples", "", "getTimeScale", "getCreationTime", "getWidth", "getHeight", "getVolume", "getSampleDurations", "setup", "Lorg/mp4parser/boxes/iso14496/part1/objectdescriptors/DecoderConfigDescriptor;", "Lorg/mp4parser/boxes/sampleentry/VisualSampleEntry;", "w", "h", "Lorg/mp4parser/boxes/sampleentry/AudioSampleEntry;", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Track {

    @NotNull
    private final Date creationTime;
    private long duration;
    private boolean first;

    @NotNull
    private String handler;
    private int height;
    private final boolean isAudio;
    private long lastPresentationTimeUs;

    @NotNull
    private SampleDescriptionBox sampleDescriptionBox;

    @NotNull
    private final ArrayList<Long> sampleDurations;

    @NotNull
    private final ArrayList<Sample> samples;

    @NotNull
    private Map<Integer, Integer> samplingFrequencyIndexMap;

    @Nullable
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Track(int i, @NotNull MediaFormat format, boolean z2) {
        Intrinsics.m18599g(format, "format");
        this.samples = new ArrayList<>();
        this.creationTime = new Date();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.sampleDurations = arrayList;
        this.isAudio = z2;
        this.samplingFrequencyIndexMap = new HashMap();
        this.first = true;
        this.samplingFrequencyIndexMap = MapsKt.m18486i(new Pair(96000, 0), new Pair(88200, 1), new Pair(64000, 2), new Pair(48000, 3), new Pair(44100, 4), new Pair(32000, 5), new Pair(24000, 6), new Pair(22050, 7), new Pair(16000, 8), new Pair(12000, 9), new Pair(11025, 10), new Pair(8000, 11));
        this.trackId = i;
        if (z2) {
            arrayList.add(1024L);
            this.duration = 1024L;
            this.volume = 1.0f;
            this.timeScale = format.getInteger("sample-rate");
            this.handler = "soun";
            this.sampleDescriptionBox = new SampleDescriptionBox();
            AudioSampleEntry upVar = setup(new AudioSampleEntry("mp4a"), format);
            ESDescriptorBox eSDescriptorBox = new ESDescriptorBox("esds");
            ESDescriptor eSDescriptor = new ESDescriptor();
            eSDescriptor.f58546c = 0;
            eSDescriptor.f58549f = new ArrayList();
            eSDescriptor.f58532a = 3;
            eSDescriptor.f58545b = 0;
            SLConfigDescriptor sLConfigDescriptor = new SLConfigDescriptor();
            sLConfigDescriptor.f58532a = 6;
            sLConfigDescriptor.f58553b = 2;
            eSDescriptor.f58548e = sLConfigDescriptor;
            DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
            decoderConfigDescriptor.f58543h = new ArrayList();
            decoderConfigDescriptor.f58532a = 4;
            DecoderConfigDescriptor upVar2 = setup(decoderConfigDescriptor);
            AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
            audioSpecificConfig.f58528h = -1;
            audioSpecificConfig.f58529i = -1;
            audioSpecificConfig.f58530j = -1;
            audioSpecificConfig.f58531k = -1;
            audioSpecificConfig.f58532a = 5;
            audioSpecificConfig.f58522b = 2;
            Integer num = this.samplingFrequencyIndexMap.get(Integer.valueOf((int) upVar.f59110g));
            Intrinsics.m18596d(num);
            audioSpecificConfig.f58523c = num.intValue();
            audioSpecificConfig.f58524d = upVar.f59108d;
            upVar2.f58542g = audioSpecificConfig;
            eSDescriptor.f58547d = upVar2;
            ByteBuffer byteBufferM21830e = eSDescriptor.m21830e();
            AbstractC0000a.m29z(Factory.m21737c(ESDescriptorBox.f58909v, eSDescriptorBox, eSDescriptorBox, eSDescriptor));
            AbstractC0000a.m29z(Factory.m21737c(AbstractDescriptorBox.f58904s, eSDescriptorBox, eSDescriptorBox, eSDescriptor));
            eSDescriptorBox.f58906j = eSDescriptor;
            AbstractC0000a.m29z(Factory.m21737c(AbstractDescriptorBox.f58902q, eSDescriptorBox, eSDescriptorBox, byteBufferM21830e));
            eSDescriptorBox.f58907n = byteBufferM21830e;
            upVar.m21816a(eSDescriptorBox);
            this.sampleDescriptionBox.m21816a(upVar);
            return;
        }
        arrayList.add(3015L);
        this.duration = 3015L;
        this.width = format.getInteger("width");
        this.height = format.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        this.sampleDescriptionBox = new SampleDescriptionBox();
        String string = format.getString("mime");
        if (!Intrinsics.m18594b(string, "video/avc")) {
            if (Intrinsics.m18594b(string, "video/mp4v")) {
                this.sampleDescriptionBox.m21816a(setup(new VisualSampleEntry("mp4v"), this.width, this.height));
                return;
            }
            return;
        }
        VisualSampleEntry upVar3 = setup(new VisualSampleEntry("avc1"), this.width, this.height);
        AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox("avcC");
        AvcDecoderConfigurationRecord avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord();
        avcDecoderConfigurationRecord.f58946f = new ArrayList();
        avcDecoderConfigurationRecord.f58947g = new ArrayList();
        avcDecoderConfigurationRecord.f58948h = true;
        avcDecoderConfigurationRecord.f58949i = 1;
        avcDecoderConfigurationRecord.f58950j = 0;
        avcDecoderConfigurationRecord.f58951k = 0;
        avcDecoderConfigurationRecord.f58952l = new ArrayList();
        avcDecoderConfigurationRecord.f58953m = 63;
        avcDecoderConfigurationRecord.f58954n = 7;
        avcDecoderConfigurationRecord.f58955o = 31;
        avcDecoderConfigurationRecord.f58956p = 31;
        avcDecoderConfigurationRecord.f58957q = 31;
        avcConfigurationBox.f58940d = avcDecoderConfigurationRecord;
        if (format.getByteBuffer("csd-0") != null) {
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer = format.getByteBuffer("csd-0");
            Intrinsics.m18596d(byteBuffer);
            byteBuffer.position(4);
            arrayList2.add(byteBuffer.slice());
            ArrayList arrayList3 = new ArrayList();
            ByteBuffer byteBuffer2 = format.getByteBuffer("csd-1");
            if (byteBuffer2 != null) {
                byteBuffer2.position(4);
                arrayList3.add(byteBuffer2.slice());
                AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58934u, avcConfigurationBox, avcConfigurationBox, arrayList2));
                avcConfigurationBox.f58940d.f58946f = arrayList2;
                AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58936w, avcConfigurationBox, avcConfigurationBox, arrayList3));
                avcConfigurationBox.f58940d.f58947g = arrayList3;
            }
        }
        if (format.containsKey(FirebaseAnalytics.Param.LEVEL)) {
            int integer = format.getInteger(FirebaseAnalytics.Param.LEVEL);
            if (integer == 1) {
                avcConfigurationBox.m21833d(1);
            } else if (integer != 2) {
                switch (integer) {
                    case 4:
                        avcConfigurationBox.m21833d(11);
                        break;
                    case 8:
                        avcConfigurationBox.m21833d(12);
                        break;
                    case 16:
                        avcConfigurationBox.m21833d(13);
                        break;
                    case 32:
                        avcConfigurationBox.m21833d(2);
                        break;
                    case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                        avcConfigurationBox.m21833d(21);
                        break;
                    case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                        avcConfigurationBox.m21833d(22);
                        break;
                    case 256:
                        avcConfigurationBox.m21833d(3);
                        break;
                    case 512:
                        avcConfigurationBox.m21833d(31);
                        break;
                    case UserMetadata.MAX_ATTRIBUTE_SIZE /* 1024 */:
                        avcConfigurationBox.m21833d(32);
                        break;
                    case 2048:
                        avcConfigurationBox.m21833d(4);
                        break;
                    case 4096:
                        avcConfigurationBox.m21833d(41);
                        break;
                    case UserMetadata.MAX_INTERNAL_KEY_SIZE /* 8192 */:
                        avcConfigurationBox.m21833d(42);
                        break;
                    case 16384:
                        avcConfigurationBox.m21833d(5);
                        break;
                    case 32768:
                        avcConfigurationBox.m21833d(51);
                        break;
                    case 65536:
                        avcConfigurationBox.m21833d(52);
                        break;
                    default:
                        avcConfigurationBox.m21833d(13);
                        break;
                }
            } else {
                avcConfigurationBox.m21833d(27);
            }
        } else {
            avcConfigurationBox.m21833d(13);
        }
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58926j, avcConfigurationBox, avcConfigurationBox, 100));
        avcConfigurationBox.f58940d.f58942b = 100;
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58912A, avcConfigurationBox, avcConfigurationBox, -1));
        avcConfigurationBox.f58940d.f58950j = -1;
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58914C, avcConfigurationBox, avcConfigurationBox, -1));
        avcConfigurationBox.f58940d.f58951k = -1;
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58938y, avcConfigurationBox, avcConfigurationBox, -1));
        avcConfigurationBox.f58940d.f58949i = -1;
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58924g, avcConfigurationBox, avcConfigurationBox, 1));
        avcConfigurationBox.f58940d.f58941a = 1;
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58932s, avcConfigurationBox, avcConfigurationBox, 3));
        avcConfigurationBox.f58940d.f58945e = 3;
        AbstractC0000a.m29z(Factory.m21737c(AvcConfigurationBox.f58928o, avcConfigurationBox, avcConfigurationBox, 0));
        avcConfigurationBox.f58940d.f58943c = 0;
        upVar3.m21816a(avcConfigurationBox);
        this.sampleDescriptionBox.m21816a(upVar3);
    }

    private final VisualSampleEntry setup(VisualSampleEntry visualSampleEntry, int i, int i2) {
        visualSampleEntry.f59099c = 1;
        visualSampleEntry.f59117o = 24;
        visualSampleEntry.f59115j = 1;
        visualSampleEntry.f59113g = 72.0d;
        visualSampleEntry.f59114i = 72.0d;
        visualSampleEntry.f59111d = i;
        visualSampleEntry.f59112f = i2;
        visualSampleEntry.f59116n = "AVC Coding";
        return visualSampleEntry;
    }

    public final void addSample(long offset, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.m18599g(bufferInfo, "bufferInfo");
        boolean z2 = (this.isAudio || (bufferInfo.flags & 1) == 0) ? false : true;
        this.samples.add(new Sample(offset, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z2 && linkedList != null) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        long j = bufferInfo.presentationTimeUs;
        long j2 = j - this.lastPresentationTimeUs;
        this.lastPresentationTimeUs = j;
        long j3 = ((j2 * ((long) this.timeScale)) + 500000) / 1000000;
        if (!this.first) {
            ArrayList<Long> arrayList = this.sampleDurations;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j3));
            this.duration += j3;
        }
        this.first = false;
    }

    @NotNull
    public final Date getCreationTime() {
        return this.creationTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getHandler() {
        return this.handler;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    @NotNull
    public final ArrayList<Long> getSampleDurations() {
        return this.sampleDurations;
    }

    @NotNull
    public final ArrayList<Sample> getSamples() {
        return this.samples;
    }

    @Nullable
    public final long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null) {
            return null;
        }
        Intrinsics.m18596d(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList<Integer> linkedList2 = this.syncSamples;
        Intrinsics.m18596d(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList<Integer> linkedList3 = this.syncSamples;
        Intrinsics.m18596d(linkedList3);
        int size = linkedList3.size();
        for (int i = 0; i < size; i++) {
            Intrinsics.m18596d(this.syncSamples);
            jArr[i] = r3.get(i).intValue();
        }
        return jArr;
    }

    public final int getTimeScale() {
        return this.timeScale;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: isAudio, reason: from getter */
    public final boolean getIsAudio() {
        return this.isAudio;
    }

    private final DecoderConfigDescriptor setup(DecoderConfigDescriptor decoderConfigDescriptor) {
        decoderConfigDescriptor.f58537b = 64;
        decoderConfigDescriptor.f58538c = 5;
        decoderConfigDescriptor.f58539d = 1536;
        decoderConfigDescriptor.f58540e = 96000L;
        decoderConfigDescriptor.f58541f = 96000L;
        return decoderConfigDescriptor;
    }

    private final AudioSampleEntry setup(AudioSampleEntry audioSampleEntry, MediaFormat mediaFormat) {
        audioSampleEntry.f59108d = mediaFormat.getInteger("channel-count") == 1 ? 2 : mediaFormat.getInteger("channel-count");
        audioSampleEntry.f59110g = mediaFormat.getInteger("sample-rate");
        audioSampleEntry.f59099c = 1;
        audioSampleEntry.f59109f = 16;
        return audioSampleEntry;
    }
}
