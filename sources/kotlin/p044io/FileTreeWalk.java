package kotlin.p044io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "WalkState", "DirectoryState", "FileTreeWalkIterator", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FileTreeWalk implements Sequence<File> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class DirectoryState extends WalkState {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "BottomUpDirectoryState", "TopDownDirectoryState", "SingleFileState", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* JADX INFO: renamed from: c */
        public final ArrayDeque f51616c = new ArrayDeque();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public final class BottomUpDirectoryState extends DirectoryState {
            @Override // kotlin.io.FileTreeWalk.WalkState
            /* JADX INFO: renamed from: a */
            public final File mo18568a() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        @SourceDebugExtension
        public final class SingleFileState extends WalkState {

            /* JADX INFO: renamed from: a */
            public boolean f51617a;

            @Override // kotlin.io.FileTreeWalk.WalkState
            /* JADX INFO: renamed from: a */
            public final File mo18568a() {
                if (this.f51617a) {
                    return null;
                }
                this.f51617a = true;
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public final class TopDownDirectoryState extends DirectoryState {
            @Override // kotlin.io.FileTreeWalk.WalkState
            /* JADX INFO: renamed from: a */
            public final File mo18568a() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    FileWalkDirection[] fileWalkDirectionArr = FileWalkDirection.f51618a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public FileTreeWalkIterator(FileTreeWalk fileTreeWalk) {
            throw null;
        }

        @Override // kotlin.collections.AbstractIterator
        /* JADX INFO: renamed from: c */
        public final void mo18318c() {
            while (true) {
                ArrayDeque arrayDeque = this.f51616c;
                WalkState walkState = (WalkState) arrayDeque.peek();
                if (walkState == null) {
                    this.f51467a = 2;
                    return;
                } else {
                    if (walkState.mo18568a() != null) {
                        throw null;
                    }
                    arrayDeque.pop();
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class WalkState {
        /* JADX INFO: renamed from: a */
        public abstract File mo18568a();
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        new FileTreeWalkIterator(this);
        throw null;
    }
}
