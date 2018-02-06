/* Copyright (c) 2017 atacama | Software GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.atacama.apenio.nks.api.io.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Collectors;

import de.atacama.apenio.nks.api.error.HttpException;
import de.atacama.apenio.nks.api.error.NksException;

public class HttpUtil {

	public static String post(String url, String data, RequestSettings settings) {
		int status;
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			/*connection.setReadTimeout(10000);
			connection.setConnectTimeout(15000);
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Accept-Charset", CHARSET);
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + CHARSET);*/
			settings.appendSettings(connection);

			//data = URLEncoder.encode(data, settings.getCharset().name());

			try (OutputStream output = connection.getOutputStream()) {
				output.write(data.getBytes(settings.getCharset()));
			}

			status = connection.getResponseCode();

			if (status == 200) {
				InputStream response = connection.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(response, settings.getCharset()));
                return in.lines().collect(Collectors.joining());
			}
		} catch (Exception ex) {
			throw new NksException(ex);
		}
		throw new HttpException(status);
	}
}
