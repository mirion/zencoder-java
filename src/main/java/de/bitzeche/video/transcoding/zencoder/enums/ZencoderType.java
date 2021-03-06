/**
 * Copyright (C) 2013 Bitzeche GmbH <info@bitzeche.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.bitzeche.video.transcoding.zencoder.enums;

public enum ZencoderType
{
  standard( "standard" ), segmented( "segmented" ), playlist( "playlist" ), transfer_only( "transfer-only ");

  final String realName;

  ZencoderType( String realName )
  {
    this.realName = realName;
  }

  public String getRealName()
  {
    return realName;
  }
}
