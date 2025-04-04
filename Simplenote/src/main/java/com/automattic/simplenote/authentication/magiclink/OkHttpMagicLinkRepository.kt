package com.automattic.simplenote.authentication.magiclink

import com.automattic.simplenote.repositories.MagicLinkRepository
import com.automattic.simplenote.repositories.MagicLinkResponseResult
import java.io.IOException
import javax.inject.Inject

class OkHttpMagicLinkRepository @Inject constructor() : MagicLinkRepository {

    @Throws(IOException::class)
    override suspend fun completeLogin(username: String, authCode: String): MagicLinkResponseResult {
        return MagicLinkResponseResult.MagicLinkCompleteSuccess(username, "dummy_sync_token")
    }

    @Throws(IOException::class)
    override suspend fun requestLogin(username: String): MagicLinkResponseResult {
        return MagicLinkResponseResult.MagicLinkRequestSuccess(200)
    }
}
