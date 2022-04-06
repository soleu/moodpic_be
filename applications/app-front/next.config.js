/** @type {import('next').NextConfig} */
const withBundleAnalyzer = require("@next/bundle-analyzer")({
  enabled: process.env.ANALYZE === "true",
});

module.exports = withBundleAnalyzer({
  reactStrictMode: true,
  compiler: {
    styledComponents: true,
  },
  eslint: {
    ignoreDuringBuilds: true,
  },
  webpack(config) {
    // config.module.rules.push({
    //   test: /\.svg$/,
    //   use: [
    //     {
    //       loader: "@svgr/webpack",
    //       options: {
    //         svgoConfig: {
    //           plugins: [
    //             {
    //               // Enable figma's wrong mask-type attribute work
    //               removeRasterImages: false,
    //               removeStyleElement: false,
    //               removeUnknownsAndDefaults: false,
    //               // Enable svgr's svg to fill the size
    //               removeViewBox: false,
    //             },
    //           ],
    //         },
    //       },
    //     },
    //   ],
    // });
    // // 절대경로
    // config.resolve.modules.push(__dirname);
    return config;
  },
});
