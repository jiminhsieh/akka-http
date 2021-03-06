/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.scaladsl.model.http2

import akka.http.impl.engine.server.InternalCustomHeader

final case class Http2StreamIdHeader(streamId: Int) extends InternalCustomHeader("x-http2-stream-id") {
  override def value = String.valueOf(streamId)
}
