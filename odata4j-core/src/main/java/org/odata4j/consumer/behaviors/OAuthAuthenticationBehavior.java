package org.odata4j.consumer.behaviors;

import org.odata4j.consumer.ODataClientRequest;
import org.odata4j.repack.org.apache.commons.codec.binary.Base64;

public class OAuthAuthenticationBehavior implements OClientBehavior {

  private final String oAuthToken;

  public OAuthAuthenticationBehavior(String oAuthToken) {
    this.oAuthToken = oAuthToken;
  }

  @Override
  public ODataClientRequest transform(ODataClientRequest request) {
    return request.header("Authorization", oAuthToken);
  }

}
