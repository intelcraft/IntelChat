package org.intelcraft.intelchat.updater;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UpdatePlugin
{
	public static String getLatestVersion(String site)
	{
		try {
			URL url = new URL(site);

			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String str;
			while((str = in.readLine()) != null)
			{
				return str;
			}

			in.close();
		} catch(MalformedURLException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static boolean isUpToDate(String version, String latestVersion)
	{
		double myVersion = Double.parseDouble(version);
		double lVersion = Double.parseDouble(latestVersion);

		if(myVersion == lVersion)
		{
			return true;
		} else {
			return false;
		}
	}

	public static void update(String site, String destination)
	{
		try
		{
			URL url = new URL(site);

			BufferedInputStream bis = new BufferedInputStream(url.openStream());
			FileOutputStream fos = new FileOutputStream(destination);
			BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

			byte data[] = new byte[1024];
			int x = 0;
			while((x = bis.read(data, 0, 1024)) >= 0)
			{
				bos.write(data, 0, x);
			}

			bis.close();
			fos.close();
			bos.close();
		} catch(MalformedURLException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
