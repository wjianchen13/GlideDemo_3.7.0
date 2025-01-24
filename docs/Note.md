# 笔记

DrawableTypeRequest 会包装 streamModelLoader和fileDescriptorModelLoader

UriLoader内部会持有一个urlLoader变量,这个变量持有的是实际网络加载的ModerLoder
ImageVideoModelLoader有2个变量
streamLoader
fileDescriptorLoader

streamLoader是StreamStringLoader类型
StreamStringLoader urlLoader 是 OkHttpGlideUrlLoader

GenericLoaderFactory 125

register(Uri.class, InputStream.class, new StreamUriLoader.Factory());

GenericLoaderFactory存储的数据结构是这样
Map<Uri.class, Map<InputStream.class, factory>>

glide.register(GlideUrl.class, InputStream.class, new OkHttpGlideUrlLoader.Factory(okHttpClient));

每一种modelClass和resourceClass对应一种modelloader

StreamStringLoader
urlLoader:StreamUriLoader

StreamUriLoader
urlLoader:HttpUrlGlideUrlLoader


String, InputStream.class -> StreamStringLoader
Uri.class, InputStream.class -> StreamUriLoader

UriLoader
StringLoader





















