# PictureSelector v2.1.0

原项目依赖的 picture_library 历史 AAR 已返回 404，因此直接从原标签保留完整模块源码构建。

- 上游仓库：LuckSiege/PictureSelector
- 标签：v2.1.0
- 提交：c5bb0decd725585850238aab44e2a4a66b1758df
- 来源：GitHub codeload 标签 ZIP（原包保存于仓库 logs/gradle-4.x-GankMM-PictureSelector-v2.1.0.zip）
- ZIP SHA-256：292f6d9b980340854372acd704fd22c3ff4057dacaba1352fa685ed8ab9834b4

保留上游文件版权声明及 README。直接迁移 Gradle 8.5 / AGP 8.2.1 / SDK 34、Java 11 和 AndroidX，保持图片选择、Luban 压缩、UCrop 裁剪源码功能；UCrop 使用同标签原始 AAR。依赖的 AndroidX 要求使本嵌入模块 minSdk 10 提升至 14，宿主应用原 minSdk 16 保留。Glide 与宿主统一为原宿主已用的 4.8.0。
