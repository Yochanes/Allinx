package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class MergePathsContent implements PathContent, GreedyContent {

    /* JADX INFO: renamed from: a */
    public final Path f34187a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f34188b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f34189c = new Path();

    /* JADX INFO: renamed from: d */
    public final ArrayList f34190d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final MergePaths f34191e;

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C23961 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34192a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f34192a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34192a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34192a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34192a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34192a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f34191e = mergePaths;
    }

    /* JADX INFO: renamed from: a */
    public final void m12593a(Path.Op op) {
        Matrix matrixM12625d;
        Matrix matrixM12625d2;
        Path path = this.f34188b;
        path.reset();
        Path path2 = this.f34187a;
        path2.reset();
        ArrayList arrayList = this.f34190d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            PathContent pathContent = (PathContent) arrayList.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                ArrayList arrayList2 = (ArrayList) contentGroup.m12589e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((PathContent) arrayList2.get(size2)).getPath();
                    TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.f34142j;
                    if (transformKeyframeAnimation != null) {
                        matrixM12625d2 = transformKeyframeAnimation.m12625d();
                    } else {
                        matrixM12625d2 = contentGroup.f34135c;
                        matrixM12625d2.reset();
                    }
                    path3.transform(matrixM12625d2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(pathContent.getPath());
            }
        }
        int i = 0;
        PathContent pathContent2 = (PathContent) arrayList.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List listM12589e = contentGroup2.m12589e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listM12589e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((PathContent) arrayList3.get(i)).getPath();
                TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.f34142j;
                if (transformKeyframeAnimation2 != null) {
                    matrixM12625d = transformKeyframeAnimation2.m12625d();
                } else {
                    matrixM12625d = contentGroup2.f34135c;
                    matrixM12625d.reset();
                }
                path4.transform(matrixM12625d);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(pathContent2.getPath());
        }
        this.f34189c.op(path2, path, op);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* JADX INFO: renamed from: b */
    public final void mo12585b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34190d;
            if (i >= arrayList.size()) {
                return;
            }
            ((PathContent) arrayList.get(i)).mo12585b(list, list2);
            i++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    /* JADX INFO: renamed from: e */
    public final void mo12592e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof PathContent) {
                this.f34190d.add((PathContent) content);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Path path = this.f34189c;
        path.reset();
        MergePaths mergePaths = this.f34191e;
        if (!mergePaths.f34573b) {
            int iOrdinal = mergePaths.f34572a.ordinal();
            if (iOrdinal == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f34190d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((PathContent) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (iOrdinal == 1) {
                    m12593a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    m12593a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    m12593a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    m12593a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
