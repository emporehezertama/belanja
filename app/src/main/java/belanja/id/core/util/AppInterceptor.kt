package belanja.id.core.util

import okhttp3.Interceptor
import okhttp3.Response

class AppInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("X-Shopify-Access-Token", "BuildConfig")
            .build()
        return chain.proceed(request)
    }
}